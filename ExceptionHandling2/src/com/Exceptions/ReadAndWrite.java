package com.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("c:/abc.txt");
    }
    void saveFile() throws FileNotFoundException {
        String a = "here file is saved";
        FileOutputStream fos = new FileOutputStream("c:/abc.txt");
    }
}
