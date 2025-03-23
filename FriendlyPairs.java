public class FriendlyPairs {
    public static void main(String[] args) {
        int n1=10;
        int n2=12;
        int s1=SumOfFactors(n1);
        int s2=SumOfFactors(n2);
        if(s1/n1 == s2/n2){
            System.out.println("FriendlyPAirs");
            
        }else System.out.println("Not Friendly Pairs");
        
    }

    public static int SumOfFactors(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
