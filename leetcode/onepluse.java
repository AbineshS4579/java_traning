import java.util.*;
public class onepluse {
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int a[]=new int[n+1];
        a[0]=1;
        return a;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i:plusOne(a)){
            System.out.print(i+" ");
        }
    }
} 
    

