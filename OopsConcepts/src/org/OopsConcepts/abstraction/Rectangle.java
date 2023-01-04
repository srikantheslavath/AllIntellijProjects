package org.OopsConcepts.abstraction;
interface Drawable{
    void draw();
}
public class Rectangle implements Drawable {

   public void draw(){
       System.out.println("this is rectangle");
   }
}
