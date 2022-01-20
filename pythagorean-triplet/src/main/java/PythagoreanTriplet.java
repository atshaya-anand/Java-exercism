import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PythagoreanTriplet{

    static List <Integer> triplet;
    static List <PythagoreanTriplet> tripletList;
    static int sumTo;
    static int factorLess;

    public PythagoreanTriplet(){
        triplet = new ArrayList<Integer>();
    }
    
    public PythagoreanTriplet(int a, int b, int c){
        triplet = new ArrayList <Integer> ();
        triplet.add(a);
        triplet.add(b);
        triplet.add(c);
    }

    static PythagoreanTriplet makeTripletsList(){
        tripletList = new ArrayList <PythagoreanTriplet> ();
        return new PythagoreanTriplet();
    }

    PythagoreanTriplet withFactorsLessThanOrEqualTo(int n){
        factorLess = n;
        return this;
    }

    PythagoreanTriplet thatSumTo(int n){
        sumTo = n;
        return this;
    }

    List <PythagoreanTriplet> build(){
        int flag = 0;
 
        // Iterate a from 1 to N-1.
        for (int a = 1; a < sumTo; a++)
        {
            // Calculate value of b
            int b = (sumTo * sumTo - 2 * sumTo * a) / (2 * sumTo - 2 * a);
 
            // The value of c = n - a - b
            int c = sumTo - a - b;
 
            if (a * a + b * b == c * c && b > 0 && c > 0)
            {
                tripletList.add(new PythagoreanTriplet(a, b, c));
                System.out.print(a);
                System.out.print(b);
                System.out.print(c);
                flag = 1;
            }
        }
        if (flag == 0)
        {
            return Collections.emptyList();
        }
        return tripletList;
    }

    public static void main(String args[]){
        PythagoreanTriplet obj = new PythagoreanTriplet();
        PythagoreanTriplet.makeTripletsList();
        obj.thatSumTo(30000);
        obj.build();
    }

}