import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exp {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("ABC.TXT");
        Class.forName("com.mysql.jdbc-driver");
        int a = 100;
        int b = 0;
        int c = a / b;
        System.out.println(c);


        String name = null;
        System.out.println(name.length());
    }
}
