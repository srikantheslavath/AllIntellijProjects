package org.OopsConcepts.abstraction;

public class Car extends Vehicle {
    void start(){
        System.out.println("my car runs on 4 tyres");
    }

    public static void main(String[] args) {
        Vehicle a=new Car();
        a.start();
        a.run();


        }
    }

