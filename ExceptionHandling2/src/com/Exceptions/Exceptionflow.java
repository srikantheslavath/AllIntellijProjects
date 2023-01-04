package com.Exceptions;

public class Exceptionflow {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println(100/50);
        System.out.println("4");
        System.out.println("5");
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        finally {
            System.out.println("srikantheslavath");
        }
        System.out.println("srikanth");
        System.out.println("vikas");
        System.out.println("6");
        System.out.println("7");
    }
}
