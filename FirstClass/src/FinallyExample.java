import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyExample {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        try {
            fis = null;
            fis = new FileInputStream("d:/abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } finally {
            if (fis != null) {
                fis.close();

            }
            System.out.println("file is closed");
        }
    }
    }






