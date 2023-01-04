package org.OopsConcepts.polymorphism;

public class SbiBank extends WorldBank{
    void balance(){
        System.out.println("minimum balance is greater than 1000");
    }

    public static void main(String[] args) {
        WorldBank c = new SbiBank();//upcasting
        c.balance();
    }
}
