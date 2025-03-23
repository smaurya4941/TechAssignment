import java.util.HashMap;
public class CalcFreqOfChar {
    public static void main(String[] args) {
        String s="SACHIN Maurya created this code";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(hm, 0)+1);
        }
        System.out.println(hm);

    }
}
