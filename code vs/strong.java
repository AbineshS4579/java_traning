import java.util.Scanner;
public class strong {
    public static int fact(int d){
        if(d==1||d==0)
            return 1;
        return d*fact(d-1);
    }
    public static void main(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),k=0,b=n;
        while(n>0){
            int d=n%10;
            k+=fact(d);
            n/=10;
        }if(b==k){
        System.out.println("Strong no.");
        return ;
        }
        System.out.println("not Strong no.");
    }
}
