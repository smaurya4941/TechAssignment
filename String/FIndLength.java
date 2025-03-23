package String;

public class FIndLength {
    public static void main(String[] args) {
        String s="SACHIN Maurya";
        int len=0;
        for(char c:s.toCharArray()){
            // System.out.println(c);
            len++;
        }
        System.out.println("Length of "+s+" is "+len);
    }
}
