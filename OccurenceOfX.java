public class OccurenceOfX {
    public static void main(String[] args) {
        int n = 898989, count = 0;
        int x= 9;

        while(n>0){
            int rem = n%10;
            if(rem == x)
                count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
