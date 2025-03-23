public class AbundantNo {
    public static void main(String[] args) {
        int n=18;
        int SOF=SumOfFactors(n);
        if(SOF>n)System.out.println("Abundant") ;
        else System.out.println("Not Abundant");;
        
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
