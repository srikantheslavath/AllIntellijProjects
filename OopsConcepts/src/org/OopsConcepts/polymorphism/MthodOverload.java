package org.OopsConcepts.polymorphism; //user defined packages

public class MthodOverload {
    public int add(int a ,int b ){

        return a+b;
    }
   public  int add(int a ,int b, int c){
        return a+b+c;
    }

    void display(){
        System.out.println(add(2,6));
        System.out.println(add(2,4,6));
    }

    public static void main(String[] args) {
        MthodOverload a = new MthodOverload();
      a.display();
    }
}
