public class Test {
    public static void main(String args[]){
        System.out.println("1");
        try{
            System.out.println("2");
            int a=10,b=0,c;
            System.out.println("3");
            c=a/b;
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");

        }
        catch(ArithmeticException e) {
            System.out.println("6");
            System.out.println(e);
            System.out.println("7");
        }
        finally{
            System.out.println("iam in finally block");
        }
        System.out.println("hello");

        }
    }
