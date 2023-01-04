package com.Exceptions;

import java.io.FileNotFoundException;

public class ExampleForThrows {
    public static void main(String[] args) throws FileNotFoundException {
        ReadAndWrite rw = new ReadAndWrite();
        rw.readFile();
        System.out.println("srikanth");
    }

}
