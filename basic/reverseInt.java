package basic;
import java.util.Scanner;
public class reverseInt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=0;
       int c=0;
        while(n>0){
int d=n%10;
r=r*10+d;
n=n/10;
c++;
        }
        System.out.println(r);
        System.out.print(c);
    }
    
}
