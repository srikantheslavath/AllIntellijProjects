public class Example1 {
    void method1() throws ArithmeticException,IndexOutOfBoundsException,NullPointerException{
        throw new ArithmeticException("calculation error");
    }
void method2()throws ArithmeticException {
    method1();
}
void method3(){
        try{
            method2();

        }
        catch (ArithmeticException e){
            System.out.println(e);

        }
}

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.method1();
        System.out.println("end of the program");

    }
}
