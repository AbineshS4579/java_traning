import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int bi=0,re=1;
        while(n>0){
            int d=n%2;
            bi+=re*d;
            re*=10;
            n/=2;
        }
        System.out.println(bi);
    }
}
