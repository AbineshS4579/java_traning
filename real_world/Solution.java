package real_world;
import java.util.*;

public class Solution {

    public static int lengthOfLongestSubstring(String st) {
        int c;
        
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<st.length();i++){
            List<Character> l=new ArrayList<>();
             c=0;
            for(int j=i;j<st.length();j++){
                if(l.contains(st.charAt(j))){
                   
                    break;
                }
                c++;
                l.add(st.charAt(j));
               
        }
        li.add(c);

       
    }
    return Collections.max(li);
     
}

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String st = s.next();

        System.out.println(lengthOfLongestSubstring(st));
    }
}