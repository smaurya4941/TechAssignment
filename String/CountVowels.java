package String;

public class CountVowels {
    public static void main(String[] args) {
        String s="SACHIN Maurya";
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                count++;
            }
        }
        System.out.println("Number of vowels in "+s+" is "+count); 
    }
}
