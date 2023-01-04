import org.junit.*;

public class Test1 {

    static int beforeclasscount =1;
    static int afterclasscount =1;
    static int beforecount =1;
    static int aftercount = 1;
    @Before
    public void setup() {
        System.out.println("excecution count of beforemethod is :" +beforecount++);
    }
    @BeforeClass
    public static void setupclass() {
        System.out.println("execution count of before class method is:" +beforeclasscount++);
    }

    @Test
    public void test2(){
        System.out.println("vikas");

        }
    @Test
    public void test31(){
        System.out.println("vikas1");
    }
    @Test
    public void test4(){
        System.out.println("srikanth");
    }
    @After
    public void tearDown() {
        System.out.println("execution count of aftermethod:"+aftercount++);
    }
    @AfterClass
    public static void teardown() {
        System.out.println("execution count of afterclassmethod:"+afterclasscount++);
    }

}
