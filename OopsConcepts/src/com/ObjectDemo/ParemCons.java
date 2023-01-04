package com.ObjectDemo;

public class ParemCons {
    int id ;
    String name;
    ParemCons(int i ,String n){
        id =i;
        name=n;
    }
    void display(){
        System.out.println(id +""+name);
    }

    public static void main(String[] args) {
        ParemCons a = new ParemCons(20,"vikas");
        a.display();
    }
}
