import java.util.*;
public class amstrong {
    public static void main(String[] args){
Scanner s=new Scanner(System.in);
int k=s.nextInt();
int n=k;
int re=0;
while(n>0){
int r=n%10;

re+=Math.pow(r,3);
n/=10;
}
if(re==k){
    System.out.println("amstrong");
    return ;
}
System.out.println("not amstrong");
    }
}
