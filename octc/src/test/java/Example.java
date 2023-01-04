import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Example {
    @BeforeEach
    public void b(){
        System.out.println("before each");
    }
    @BeforeAll
    public static void ba(){
        System.out.println("before all");
    }
    @Test
    public void t(){
        System.out.println("testcase");
    }
    @AfterEach
    public void ae(){
        System.out.println("after each");
    }
    @AfterAll
    public static void aa(){
        System.out.println("after all");
    }
}
