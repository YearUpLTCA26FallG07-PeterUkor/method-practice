package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        // check is even
        System.out.println(isEven(5));
        // check is positive
        System.out.println(isPositive(-5));

    }
    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static boolean isPositive(int value) {
        return (value > 0);
    }
}
