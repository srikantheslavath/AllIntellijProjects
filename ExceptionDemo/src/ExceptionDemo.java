public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int i = 8;
            int j = 0;
            int k = i / j;

            int a[] = new int[6];
            a[8] = 8;
        } catch (ArithmeticException e) {
            System.out.println("output is" + e);
        } catch (ArrayIndexOutOfBoundsException Ae) {

            System.out.println("Exception handeled" + Ae);


        }
    }
}