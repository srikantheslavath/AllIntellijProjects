import java.util.ArrayList;
import java.util.Collections;

public class Collect {
    public static void main(String args[])
        {
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(2);
            a.add(4);
            a.add(3);
            System.out.println("Before Sorting: "+ a);
            Collections.sort(a, Collections.reverseOrder());
            System.out.println("After Sorting: "+ a);
        }
    }

