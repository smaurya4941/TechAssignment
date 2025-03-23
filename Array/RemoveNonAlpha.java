package Array;

public class RemoveNonAlpha {
    public static void main(String[] args) {
        String str = "a1b2c3d4e5f6g7h8i9j0";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    
    }
}
