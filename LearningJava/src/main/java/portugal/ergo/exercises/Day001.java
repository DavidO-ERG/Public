package portugal.ergo.exercises;

public class Day001 {

    public static void exercise1(String str) {
        System.out.println();
        System.out.println("Exercise 1 - Print String");

        System.out.println(str);
    }


    public static void exercise2() {
        System.out.println();
        System.out.println("Exercise 2 - Variables");

        int num = 5 + 10;
        System.out.println(num);
    }


    public static void exercise3() {
        System.out.println();
        System.out.println("Exercise 3 - Expressions");

        int num1 = 35;
        int num2 = 12;
        int num3 = num1 * 2;
        int result = num1 + num2 + num3;
        int lastOne = 1000 - result;
        System.out.println(lastOne);
    }


    public static void exercise4() {
        System.out.println();
        System.out.println("Exercise 4 - Primitive Types - Integers, Byte, Short and Long");

        int intMinNumValue = Integer.MIN_VALUE; // val can underflow
        int intMaxNumValue = Integer.MAX_VALUE; // val can overflow
        System.out.println("Min Int: " + intMinNumValue);
        System.out.println("Max Int: " + intMaxNumValue);
        System.out.println("--------------------");
        short shortMinNumValue = Short.MIN_VALUE;
        short shortMaxNumValue = Short.MAX_VALUE;
        System.out.println("Min Short: " + shortMinNumValue);
        System.out.println("Max Short: " + shortMaxNumValue);
        System.out.println("--------------------");
        long longMinNumValue = Long.MIN_VALUE;
        long longMaxNumValue = Long.MAX_VALUE;
        System.out.println("Min Long: " + longMinNumValue);
        System.out.println("Max Long: " + longMaxNumValue);
        System.out.println("--------------------");
        byte byteMinNumValue = Byte.MIN_VALUE;
        byte byteMaxNumValue = Byte.MAX_VALUE;
        System.out.println("Min Byte: " + byteMinNumValue);
        System.out.println("Max Byte: " + byteMaxNumValue);

    }


    public static void exercise5() {
        System.out.println();
        System.out.println("Exercise 5 - Primitive Types - Float and Double");

        float floatNumMin = Float.MIN_VALUE;
        float floatNumMax = Float.MAX_VALUE;
        System.out.println("Float Min: " + floatNumMin);
        System.out.println("Float Max: " + floatNumMax);

        double doubleNumMin = Double.MIN_VALUE;
        double doubleNumMax = Double.MAX_VALUE;
        System.out.println("Double Min: " + doubleNumMin);
        System.out.println("Double Max: " + doubleNumMax);

    }

    public static void exercise6() {
        System.out.println();
        System.out.println("Exercise 6 - Primitive Types - Char and Bool");

        char aChar = '€';
        boolean isTrue = false;
        char aUniChar = '\u00A9';

        System.out.println(aChar);
        System.out.println(isTrue);
        System.out.println(aUniChar);
    }

    public static void exercise7() {
        System.out.println();
        System.out.println("Exercise 7 - Operators");

        int result = 2 + 2;
        System.out.println(result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
    }


    public static void exercise8() {
        System.out.println();
        System.out.println("Exercise 8 - If Else");

        boolean isTrue = false;
        if (!isTrue) {
            System.out.println("It is false");
        } else {
            System.out.println("It is true");
        }
        int score = 100;
        if (score >= 100) {
            System.out.println("high score");
        }

    }

    public static void exercise9() {
        System.out.println();
        System.out.println("Exercise 9 - Ternary Operator ");

        boolean isCar = false;
        int wasCar = isCar ? 1 : 0;
        System.out.println(wasCar);
    }

    public static void challenge1() {
        System.out.println();
        System.out.println("Challenge");

        double num = 20.0;
        double num2 = 80.0;

        double result = (num + num2) * 100.0;
        System.out.println(result);

        double remainder = result % 40.00;
        System.out.println(remainder);

        boolean hasRemainder = remainder == 0.0;
        System.out.println(hasRemainder);

        if (!hasRemainder) {
            System.out.println("Got some remainder");
        }
    }

    public static void exercise10() {
        System.out.println();
        System.out.println("Exercise 10 - Code Blocks { } ");

        int num = 50;
        if (num == 50){
            System.out.println("your score was: " + num);
        }
        else {
            System.out.println("not good enough! :)");
        }
    }

    public static void exercise11(int num) {
        System.out.println();
        System.out.println("Exercise 11 - Methods");

        if (num >= 50){
            System.out.println("your score was: " + num);
        }
        else {
            System.out.println("not good enough! :)");
        }

    }

    public static void exercise12_1(String name, int position) {
        System.out.println();
        System.out.println("Exercise 12 - More Methods");
        System.out.println(name + " managed to get into position " + position);
    }

    public static int exercise12_2(int score){
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500)) {
            return 2;
        } else if ((score >= 100)) {
            return 3;
        }
        return 4;
    }


    public static long exercise13_1(double kmPerHour) {
        long result = -1;
        double milesInKm = 1.609344;
        if (kmPerHour > 0) {
            result = (long) (kmPerHour * milesInKm);
        }
        return result;
        }

    public static void exercise13_2(long results) {
        System.out.println();
        System.out.println("Exercise 13 - Speed Converter");
        System.out.println("is aprox: " + results + " miles");
    }


    public static int exercise14(String player, int score) {
        System.out.println();
        System.out.println("Exercise 14 - Method overloading");

        System.out.println("Player: " + player + ", Score: " + score);
        return score * 1000;
    }
    public static int exercise14(int score) {
        System.out.println();
        System.out.println("Exercise 14 - Method overloading");

        System.out.println("Player: Unknown, Score: " + score);
        return score * 1000;
    }
}