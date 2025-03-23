public class StrongNumber {
    public static void main(String[] args) {
        int n=170;
        int temp=n;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            int fact=factorial(rem);
            sum+=fact;
            temp=temp/10;
        }
        // System.out.println(sum);
        if(sum==n){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        
    }
    public static int factorial(int n) {
        // int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        // System.out.println(fact);
        return fact;
    }
}
