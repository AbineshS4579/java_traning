import java.util.*;
// public class stringpalindrome {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         String st=s.next();
//         String sr=new StringBuilder(st).reverse().toString();
//         if(st.equals(sr)){
//             System.out.println("palindrome");
//             return;
//         }
//         System.out.println("not a palindrome");
//     }
// }
//import java.util.Scanner;
// public class stringpalindrome{
//     public static boolean check(String st){
//         for(int i=0,j=st.length()-1;i<j;i++,j--){
//             if(st.charAt(i)!=st.charAt(j))
//                 return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//      Scanner s=new Scanner(System.in);
//      String st=s.next();
//      if(check(st)){
//         System.out.println("palindrome");
//         return;
//      }
//      System.out.println("not palindrome");
//     }

// }
import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=n;
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(k==r){
            System.out.println("palindrome");
        return ;
        }
        System.out.println("not palindrome");

    }
}
