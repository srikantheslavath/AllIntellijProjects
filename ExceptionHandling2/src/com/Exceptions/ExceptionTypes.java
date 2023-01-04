package com.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTypes {
    public static void main(String[] args) {
       try {
           int a = 100, b = 0, c;

           c = a / b;
           System.out.println(c);
           FileInputStream file = null;

           file = new FileInputStream("d:/abc.txt"); // compile time exceptions

       } catch(ArithmeticException X){

             //arithmatic exception
       }catch(Exception d) {
           d.printStackTrace();
       }




    }


}
