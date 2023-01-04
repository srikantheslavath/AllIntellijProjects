import DemoException2.MyOwnException;

import java.util.Scanner;

public class ExceptionThrow {
    public static void main(String[] args) throws ArithmeticException, MyOwnException {

        Scanner s = new Scanner(System.in);

        System.out.println("please enter your roll number");
        int roll = s.nextInt();

        if (roll < 0) {

            throw new MyOwnException("roll no cant be negative");
        } else {

            System.out.println("valid roll number");
        }
    }
}

