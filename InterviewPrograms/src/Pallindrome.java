public class Pallindrome {

    public static void main(String args[]) {

        int reverse = 0;
        int temp;
        int n = 454;//It is the number variable to be checked for palindrome


        while (n > 0) {
            temp = n % 10;  //getting remainder
            reverse = (reverse * 10) + temp;
            n = n / 10;
        }
        System.out.println(reverse);

    if(n==reverse) {
        System.out.println("pallindrome");
    }
    else{
        System.out.println("not pallindrome");
    }
    }
}

