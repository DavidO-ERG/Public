# -------------------------- INTRO ---------------------------- #
# Simplistic mining calculator
# Completely offline. The next versions will bring API connectors for price and network values.
# Returns a Value (positive/negative) depending on the given values.
#
# Assume that the 'ReturnedValue' is equal to the inserted values for currency.
# A file is stored in the same folder as the script called 'Ergo-Mining-Calculator.json'
# This file will store the values for each day only (as 'day-index').
# If you insert multiple values in the same day, it will only save the last inserted.
# The 'miner-revenue' and 'miner-spending' are stored as last pair values in json file.
#
# ------------------------- CHANGELOG --------------------------- #
# v0.1 - 12/08/2022
#       Initial release: Simplistic Mining Calculator.
#
# v0.2 - 14/08/2022
#       Layout bugs fixed.
#       Adjusted Ergo Logo.
#       Added function to save Miner Results to a json file.
#       The function "_call" was split into multiple functions.
#
# v.03 - 17/08/2022:
#       Created README.md with an explanation on how to use this calculator and additional notes.
#       Added new button with Ergo Platform banner that redirects to the website ErgoPlatform.org.
#       Change "Calculate" button from text to an Ergo Logo image.
#       Refactored the code to be able to work with the new folder structure (easier to update/maintain)
#       Corrected the input field "Network Hash".
#       Added API functionality to the "Price", "Network Hashrate" and "Block Rewards", powered by TokenJay.App and WhatToMine.com
#
# -------------------------- MODULES ---------------------------- #
from Ergo_Mining_Calc.views import gui


# ---------------------------- MAIN ------------------------------ #
start: gui.Ergo = gui.Ergo()
