import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        // System.out.println("Enter number of terms: ");
        
        ArrayList<Integer> list=new ArrayList<>();
        int n=10;
        int a=0;
        int b=1;
        list.add(a);
        list.add(b);
        for(int i=0;i<n-2;i++ ){
            int c=a+b;
            list.add(c);
            a=b;
            b=c;

        }
        System.out.println(list);


    }
}
