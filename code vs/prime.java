import java.util.*;
public class prime {
    public static boolean primec(int n){
        if(n==0||n==1){
            return false;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
              }     }
   return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),k=s.nextInt(),c=0;
        for(int i=n;i<k;i++){
            if(primec(i)){
                c++;
                System.out.print(i+" ");
            }

        }   
        System.out.print("\ncount:"+c);
    }}

