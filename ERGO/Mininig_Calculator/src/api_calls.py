import json
import requests
from typing import Optional

API_TOKENJAY: str = "https://api.tokenjay.app/tokens/prices/03faf2cb329f2e90d6d23b58d91bbb6c046aa143261cc21f52fbe2824bfcbf04"
API_WHATTOMINE: str = "https://whattomine.com/coins.json"


def test_api() -> bool:
    test_req_coin: requests.Response = requests.get(API_WHATTOMINE)
    test_req_price: requests.Response = requests.get(API_TOKENJAY)
    if not test_req_coin.raise_for_status():
        if not test_req_price.raise_for_status():
            return True
    return False


def call_api_coin() -> Optional[bool]:
    req_coin: requests.Response = requests.get(API_WHATTOMINE)
    if not req_coin.raise_for_status():
        with open("./data/MinersData/WhatToMine.json", "w") as file:
            json.dump(req_coin.json()["coins"]["Ergo"], file, indent=4)
        return req_coin.json()["coins"]["Ergo"]
    return False


def call_api_price() -> Optional[bool]:
    req_price: requests.Response = requests.get(API_TOKENJAY)
    if not req_price.raise_for_status():
        with open("./data/MinersData/Ergo-SigUSD.json", "w") as file:
            json.dump(req_price.json(), file, indent=4)
        return req_price.json()
    return False
