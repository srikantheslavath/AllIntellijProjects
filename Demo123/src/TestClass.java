import java.io.FileNotFoundException;

public class TestClass {
    public static void main(String[] args) {
        ReadAndWrite a = new ReadAndWrite();
        try {
            a.savefile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("srikanth");
        }
    }

}
