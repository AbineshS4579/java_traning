import java.util.*;
public class anagram {
    public static void main(){
        Scanner s=new Scanner(System.in);
        String st=s.next(),sr=s.next();
        if(st.length()!=sr.length()){
            System.out.println("not anagram");
            return;
        }
        char[] a=st.toCharArray();
        char[] b=sr.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("anagram");
            return;
        }
        System.out.println("not anagram");
    }
}
