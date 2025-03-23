package Matrix;

public class SearchEle {
    public static void main(String[] args) {
        int a[][] = {{0,1,12,3}, {4,5,6,7}, {8,9,10,11}};;
        int key=6;
        for(int i=0; i<a.length; i++){

            for(int j=0; j<a[0].length; j++){
                if(a[i][j] == key){
                    System.out.println("Element found at index: "+i+" "+j);
                    return;
                }

            }

        }
    }
}
