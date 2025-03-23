package Array;
import java.util.*;
public class CountDistinctEle {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 40, 50, 20, 10, 20, 30, 10};
        HashSet<Integer> set = new HashSet<>();
        for(int e:arr){
            set.add(e);
        }
        System.out.println("Number of Distinct Element: "+ set.size());
        
    }
}
