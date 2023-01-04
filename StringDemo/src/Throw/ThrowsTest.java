package Throw;

import java.io.FileNotFoundException;

public class ThrowsTest {
    public static void main(String[] args) {
        ReadAndWrite rw =new ReadAndWrite();
        try {
            rw.readfile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("srikanth");
    }
}
