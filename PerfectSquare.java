public class PerfectSquare {
    public static void main(String[] args) {
        int n=26;
        int sq=(int)Math.sqrt(n);
        if(sq*sq==n){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a Perfect Square");
        }
    }
}
