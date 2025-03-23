public class HCF {
    public static void main(String[] args) {
        int n1=37;
        int n2=18;
        int small=Integer.MAX_VALUE;
        if(n1>=n2)small=n2;
        else small=n1;

        for(int i=small;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println("HCF: "+ i);
                return;
            }
            

        }
    }
}
