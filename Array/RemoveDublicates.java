package Array;

public class RemoveDublicates {
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 30, 50, 20, 10, 20};
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
