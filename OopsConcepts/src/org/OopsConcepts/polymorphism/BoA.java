package org.OopsConcepts.polymorphism;

public class BoA {
    public int getbalance(){
        return 2000;
    }

    public static void main(String[] args) {
        BoA a = new BoA();
        SbiBank b= new SbiBank();
        System.out.println(a.getbalance());

    }
}
