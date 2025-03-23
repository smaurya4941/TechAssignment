package String;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        boolean status=true;

     if(s1.length()!=s2.length())
         status = false;
     else {
         char[] a1 = s1.toLowerCase().toCharArray();
         char[] a2 = s2.toLowerCase().toCharArray();
         Arrays.sort(a1);
         Arrays.sort(a2);
         status = Arrays.equals(a1, a2);
       }
       System.out.println(status);
        
    }
}
