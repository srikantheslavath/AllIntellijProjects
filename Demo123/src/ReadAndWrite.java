import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("abc.txt");

    }
    void savefile() throws FileNotFoundException {
        String text = "hello";
        FileOutputStream fos= new FileOutputStream("d:abc.txt");
    }

}
