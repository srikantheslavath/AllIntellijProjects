package com.ObjectDemo;

public class ThisKey {
    int id;
    String name ;
    ThisKey(int id,String name){
        this.id=id;
        this.name=name;

    }
    void display(){
        System.out.println(id+ ""+name);
    }

    public static void main(String[] args) {
        ThisKey a = new ThisKey(30,"srikanth");
        a.display();
    }
}
