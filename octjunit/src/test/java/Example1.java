import org.junit.*;
import org.junit.jupiter.api.*;

public class Example1 {
     static int beforeclasscount = 1;
     static int afterclasscount = 1;
     static int beforecount = 1;
     static int aftercount = 1;

    @BeforeAll
    public static void hello(){
        System.out.println(" before class");
    }
     @BeforeEach
     public void b(){
         System.out.println(" before test case");
     }

     @Test
    public void tc1(){
         System.out.println(" test case 1");
     }
    @Test
    public void tc2(){
        System.out.println("test case 2");
    }

     @AfterAll
     public static void world(){
         System.out.println(" after class");
     }

     @AfterEach
    public void a(){
         System.out.println(" after the test case");
     }

}
