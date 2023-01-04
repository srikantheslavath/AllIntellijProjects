package com.ObjectDemo;

public class StaticKey {
    int id ;
    String name;
    static String surname = "nayak";

    StaticKey(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id +""+name+""+surname);
    }
    static void changevalue(){
        surname ="eslavath";
    }

    public static void main(String[] args) {
        StaticKey b = new StaticKey(40,"VIKAS");
        StaticKey c = new StaticKey(30,"srikanth");
        b.display();
        StaticKey.changevalue();


    }
}
