package Array;
import java.util.*;
public class OccurenceOfEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int e:arr){
            map.put(e,map.getOrDefault(e,0)+1);
         }
        System.out.println(map);
    }
}   