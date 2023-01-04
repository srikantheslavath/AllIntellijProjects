import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter age");
        int age = s.nextInt();
        if (age < 18) {
            throw new YoungerAgeException("HE CANT VOTE");

                }
        else{
            System.out.println("he can vote");
            }
        }
    }


