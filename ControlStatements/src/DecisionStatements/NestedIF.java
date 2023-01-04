package DecisionStatements;

public class NestedIF {
    public static void main(String[] args) {
        int age = 20;
        int weight = 50;
        if (age >= 18) {
            if (weight >= 60) {
                System.out.println("he is eligible to donate blood");
            } else {
                System.out.println("he cant donate");
            }
            else{
                System.out.println("result ");
            }
        }
    }
}



