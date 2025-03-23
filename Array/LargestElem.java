package Array;

public class LargestElem {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int largest=Integer.MIN_VALUE;
        for(int e:arr){
            largest=Math.max(largest, e);
        }
        System.out.println("Largest :"+ largest);
    }
}
