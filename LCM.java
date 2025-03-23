public class LCM {
    public static void main(String[] args) {
        int n1=4;
        int n2=8;
        int max=Integer.MIN_VALUE;
        if(n1>=n2)max=n1;
        else max=n2;
        for(int i=max;i<=n1*n2;i++){
            if(i%n1==0 && i%n2==0){
                System.out.println("LCM : "+ i);
                break;
            }
        }
    }
}
