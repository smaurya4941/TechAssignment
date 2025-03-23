package String;

public class AlphabetOrNot {
    public static void main(String[] args) {
        char ch='d';
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Alphabet");
        }
        else System.out.println("Not Alphabet");
        
    }
}
