package Array;

public class reverseArr {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10,20};
        int n=arr.length;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
