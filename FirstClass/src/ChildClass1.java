public class ChildClass1 extends MainCllass{
    void firstclass(){
        System.out.println("hii how are you");
    }

    public static void main(String[] args) {
        MainCllass a = new ChildClass1();
        a.firstclass();
    }
}

