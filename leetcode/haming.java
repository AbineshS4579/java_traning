import java.util.Scanner;
public class haming {  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int bi=0,re=1,c=0;
        while(n>0){
            int r=n%2;
            if(r==1)
            c++;
            bi=bi*re+r;
            re*=10;
            n/=2;
        }
       System.out.println(bi+" "+c);
    }

}
