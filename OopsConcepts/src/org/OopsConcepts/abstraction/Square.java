package org.OopsConcepts.abstraction;

public class Square implements Drawable{
    public void draw(){
        System.out.println("this is a square");
    }

    public static void main(String[] args) {
        Drawable a = new Rectangle();
        a.draw();
    }
}

