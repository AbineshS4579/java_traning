import java.util.*;
public class palindrome {
    
    
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);

            if(!((l >= 'A' && l <= 'Z') || (l >= 'a' && l <= 'z') || (l >= '0' && l <= '9'))){
                left++;
                continue;
            }
            if(!((r >= 'A' && r <= 'Z') || (r >= 'a' && r <= 'z') || (r >= '0' && r <= '9'))){
                right--;
                continue;
            }

            if(s.charAt(left) >= 'A' && s.charAt(left) <= 'Z'){
                l = (char)((int)s.charAt(left) + 32);
            }
            if(s.charAt(right) >= 'A' && s.charAt(right) <= 'Z'){
                r = (char)((int)s.charAt(right) + 32);
            }

            if(l != r) return false;
            left++;
            right--;
        }
        return true;
    
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("palin");
            return ;
        }
        System.out.println("not");
    }
}
