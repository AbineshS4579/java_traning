 import java.util.Scanner;
class lp {
//     public static String longestPalindrome(String s) {
//         for(int i=0,j=s.length()-1;i<j;i++,j--){
//             if(s.charAt(i)!=s.charAt(j)){
//             return "";
//             }
//         }
//         return s;
//     }
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         String st=s.next(),ans="",ch;
//         for(int i=0;i<st.length();i++){
//             for(int j=i+1;j<st.length();j++){
//                 ch=st.substring(i,j);
//                 if(!(longestPalindrome(ch).equals(" "))&&ch.length() > ans.length())
//                 ans=ch;
//             }
//         }
//         System.out.println(ans);
//     }
// }


    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }

    public static String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String ch = s.substring(i, j);

                if (isPalindrome(ch) && ch.length() > ans.length()) {
                    ans = ch;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.next();
        System.out.println(longestPalindrome(st));
    }
}