import java.util.Scanner;
public class frequany {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     long n=s.nextLong(),c=0,m=s.nextInt();
     while(n>0){
        long d=n%10;
        if(d==m)
            c++;
        n/=10;
     }
     System.out.println(c);
    }
}
