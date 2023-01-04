public class Child extends Parent{
    void m1() {
        super.m1();
    System.out.println("this is child class");
}

    public static void main(String[] args) {

        Child m2 = new Child();
        m2.m1();


    }
    }
