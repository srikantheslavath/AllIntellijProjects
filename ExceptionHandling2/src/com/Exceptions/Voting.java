package com.Exceptions;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the age");
        int age=a.nextInt(); //input from user
try {
    if (age < 18) {
        throw new YoungerAgeException("YOU CANT VOTE");
    } else {
        System.out.println("you can vote");
    }
}catch(YoungerAgeException e){
    e.printStackTrace();
}
        System.out.println("srikanth");
        System.out.println("1");
    }
}
