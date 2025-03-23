package Array;
import java.util.*;
public class FindNonRepeating {
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 30, 50, 20, 10, 20};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e:arr){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                System.out.println("Non Repeating Element: "+e.getKey());
            }
        }
    }
}
