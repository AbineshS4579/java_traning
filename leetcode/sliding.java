import java.util.*;
class sliding {
    public static int strStr(String haystack, String needle) {
        int n=needle.length();
        for(int i=0;i<=haystack.length()-n;i++){
            if(haystack.substring(i,i+n).equals(needle))
                return i;

        }
        return -1;
        // StringBuilder ans=new StringBuilder();
        // for(int i=0;i<n;i++){
        //     ans.append(haystack.charAt(i));
        // }
        // for(int i=n;i<haystack.length();i++){
        //     if(needle.contentEquals(ans))
        //     return 0;
        //     ans.deleteCharAt(0);
        //     ans.append(haystack.charAt(i));
            
        // }
        // return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String h=sc.next(),n=sc.next();
        System.out.println(strStr(h,n));
    }
}