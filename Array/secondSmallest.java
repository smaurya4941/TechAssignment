package Array;
import java.util.*;
public class secondSmallest {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
