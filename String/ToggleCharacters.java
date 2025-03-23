package String;

public class ToggleCharacters {
    public static void main(String[] args) {
        String s="SaCHinMaURya";
        String toggled="";
        for(char c:s.toCharArray()){
            if(c>='A' && c<='Z'){
                toggled+=(char)(c+32);
            }else if(c>='a' && c<='z'){
                toggled+=(char)(c-32);
            }else{
                toggled+=c;
            }
        }
        System.out.println("Toggled string of "+s+" is "+toggled);
    }
}
