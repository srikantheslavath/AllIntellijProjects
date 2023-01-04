package com.Strings;

import java.util.Locale;

public class Example {
    public static void main(String[] args) {
        String a = " vikas "; //literal
        String b = new String("srikanth");
        System.out.println(a.toUpperCase());
        System.out.println(a.length());
        System.out.println(a.replace("vi","bi"));
        System.out.println(a.startsWith("bi"));
        System.out.println(a+b);
        System.out.println(a.charAt(3));

    }
}
