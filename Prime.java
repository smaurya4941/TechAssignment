import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i=2;
        boolean check=true;
        while(i<=n/2){
            if(n%i==0){
                check=false;
                break;
            }
            i++;
        }
        System.out.println(check);
        
    }
}
