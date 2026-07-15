

import java.util.Scanner;

public class palindrome {
    public static String pal(String st){
        for(int i=0,j=st.length()-1;i<j;i++,j--){
            if(st.charAt(i)!=st.charAt(j))return "not palindrome";

        }
        return "palindrome";
    }
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
   String st=s.next();
  
   System.out.println(pal(st));

    }
   

}
