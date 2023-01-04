package Throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    void readfile() throws FileNotFoundException {
        FileInputStream fis =new FileInputStream("c://xyz.txt");
    }
    void savefile() throws FileNotFoundException {
        String text ="this is a demo program";
        FileOutputStream fos=new FileOutputStream("c://abc.txt");
    }
}
