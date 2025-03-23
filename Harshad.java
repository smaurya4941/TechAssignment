
public class Harshad{ //divisible by it sum of digits
    public static void main(String[] args) {
        int n=25;
        int SOD=SOD(n);

        if(n%SOD==0){
            System.out.println("Harshad No");
        }else System.out.println("Not Harshad no.");
    }

    public static int SOD(int n) {
        
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        // System.out.println(sum);
        return sum;
    }
}