package portugal.ergo.exercises;

import java.util.ArrayList;
import java.util.List;

public class Day002 {

    public static void exercise1(int minutes, int seconds){
        System.out.println();
        System.out.println("Exercise 1");
        if ((minutes >= 0) || (seconds >= 0 && seconds <=59)){
            int hoursTotal = minutes / 60;
            int minutesTotal = minutes % 60;
            int secondsTotal = seconds % 60;
            if ((hoursTotal < 10) && (minutesTotal < 10) && (secondsTotal < 10)) {
                System.out.println("0" + hoursTotal + "h 0" + minutesTotal + "m 0" + secondsTotal + "s");
            }
            System.out.println(hoursTotal + "h " + minutesTotal + "m " + secondsTotal + "s");
        }
        else {
            System.out.println("Invalid input");
        }

    }
    public static void exercise1(int seconds) {
        if (seconds >= 0) {
            int minutesTotal = seconds / 60;
            int secondsTotal = seconds % 60;
            if ((minutesTotal < 10) && (secondsTotal < 10)) {
                System.out.println("0" + minutesTotal + "m 0" + secondsTotal + "s"); // for leading zeros
            }
            System.out.println(minutesTotal + "m " + secondsTotal + "s");
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void exercise2(int a, int b, int c) {
        System.out.println();
        System.out.println("Exercise 2");
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        }
        else if (a == b && b == c){
            System.out.println("All numbers are equal");
        }
        else if (a != b && b != c && a != c){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean exercise3(boolean summer, int temperature) {
        System.out.println();
        System.out.println("Exercise 3");
        int minTemp = 25;
        int maxTemp = 45;

        if (summer) {
            if ((temperature < minTemp) || (temperature > maxTemp)) {
                return false;
            }
        }
        else {
            if ((temperature < minTemp) || (temperature > (maxTemp - 10))){
                return false;
            }
        }
        return true;
    }

    public static void exercise4() {
        System.out.println();
        System.out.println("Exercise 4");

        int num = 5;

        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default value");
                break;
        }
    }

    public static void exercise5(int day) {
        System.out.println();
        System.out.println("Exercise 5");
        switch (day) {
            case 0:
                System.out.println("Monday"); break;
            case 1:
                System.out.println("Tuesday"); break;
            case 2:
                System.out.println("Wednesday"); break;
            case 3:
                System.out.println("Thursday"); break;
            case 4:
                System.out.println("Friday"); break;
            case 5:
                System.out.println("Saturday"); break;
            case 6:
                System.out.println("Sunday"); break;
            default:
                System.out.println("Unknown day"); break;
        }
    }

    public static void exercise6(int number) {
        System.out.println();
        System.out.println("Exercise 6");
        switch (number) {
                case 0:
                    System.out.println("ZERO"); break;
                case 1:
                    System.out.println("ONE"); break;
                case 2:
                    System.out.println("TWO"); break;
                case 3:
                    System.out.println("THREE"); break;
                case 4:
                    System.out.println("FOUR"); break;
                case 5:
                    System.out.println("FIVE"); break;
                case 6:
                    System.out.println("SIX"); break;
                case 7:
                    System.out.println("SEVEN"); break;
                case 8:
                    System.out.println("EIGHT"); break;
                case 9:
                    System.out.println("NINE"); break;
                default:
                    System.out.println("OTHER"); break;
        }
    }


        public static void exercise7() {
            System.out.println();
            System.out.println("Exercise 7");

            int result = 0;
            List<Integer> count = new ArrayList<>();

            for (int i= 1; i <= 1000; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)){
                    count.add(i);
                    result +=i;
                }
                if (count.size() >= 5) {
                    break;
                }
            }
            System.out.println(count);
            System.out.println(result);
        }


    public static boolean exercise8_1(int number) {
        if ((number % 2 != 0) && (number > 0)) {
            return true;
        }
        return false;
    }

    public static int exercise8_2(int start, int end) {
        int result = 0;
        if ((end >= start) && (start > 0)) {
            while (start <= end) {
                if (exercise8_1(start)) {
                    result += start;
                }
                start++;
            }
            return result;
        }
        return -1;
    }

    public static void exercise9(){
        System.out.println();
        System.out.println("Exercise 9");

        int count = 1;
        while (count != 6) {
            System.out.println("counting " + count);
            count++;
        }
    }

    public static void exercise10() {
        System.out.println();
        System.out.println("Exercise 10");
        
    }


}