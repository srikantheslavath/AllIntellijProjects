package org.OopsConcepts.abstraction;

abstract class Vehicle {
    Vehicle() {
        System.out.println("car is running");
    }

    abstract void start();

   void run() {
        System.out.println("car stopped");
    }

}
