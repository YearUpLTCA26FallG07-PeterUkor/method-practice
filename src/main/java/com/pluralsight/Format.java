package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String formatedName = formatName("Bob", "Smith");
        System.out.println(formatedName);
    }

    public static String formatName(String first, String last) {
        return (last + ", " + first);
    }
}
