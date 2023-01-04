package LoopingStatements;

public class NestedForLoop {
    public static void main(String[] args) {
      for (int i =1;i<=4;i++){ //for i=2
          for(int j=4;j>=i;j--){
              System.out.println("*");
            }
          System.out.println();
        }

    }
}
