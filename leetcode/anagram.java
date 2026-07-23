import java.util.*;

public class anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()==t.length())
            return false;
        char[] a=s.toCharArray(),b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        if(isAnagram(s1,s2)){
            System.out.println("Anagram");
            return ;
        }
        System.out.println("not Anagram");
    }
}

