package Array;

public class SmallestEle {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int smallest=Integer.MAX_VALUE;
        for(int e:arr){
            smallest=Math.min(smallest, e);
        }
        System.out.println("smallest :"+ smallest);
    }
}
