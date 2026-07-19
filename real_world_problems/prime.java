import java.util.*;
public class prime {
    public static boolean ch(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean v=true;
        while(v){
            if(ch(++n)){
                System.out.println("prime: "+n);
                return ;
            }
        }
    }
}
