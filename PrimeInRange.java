import java.util.*;

public class PrimeInRange{
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Jai Shree RadhKrishna");
        System.out.println("Enter range:");
        int lowerlimit=sc.nextInt();
        int upperlimit=sc.nextInt();
        if(lowerlimit<=2 || upperlimit<=2){
            System.out.println("Enter range greater than 2");
            return;
        }
        for(int i=lowerlimit;i<=upperlimit;i++){
            if(Prime(i)){
                primeNumbers.add(i);

            }
        }
        System.out.println(primeNumbers);

    }

    public static  boolean Prime(int n){
        int i=2;
        boolean check=true;
        while(i<=n/2){
            if(n%i==0){
                check=false;
                break;
            }
            i++;
        }
        return check;
    }
}