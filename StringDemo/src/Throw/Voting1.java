package Throw;

public class Voting1 {
    public static void main(String[] args) {
        int age =15 ;
        if(age<18){
            throw new Vote("u cant vote");
        }
        else{
            System.out.println("you can vote");
        }
    }
}
