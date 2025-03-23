package Array;
import java.util.*;

public class DisjointArrayOrNot {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {80, 71, 29, 3};
        for(int e:arr1){
            set.add(e);
        }
        for(int e:arr2){
            set.add(e);
        }
        if(set.size()==arr1.length+arr2.length)
            System.out.println("Disjoint Array");
        else {
            System.out.println("Not Disjoint Array");
        }
    }
}
