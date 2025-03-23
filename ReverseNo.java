import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int num=0;
        while(n>0){
            int ld=n%10;
            num=num*10+ld;

        }
        System.out.println(num);
        
    }
    
}
