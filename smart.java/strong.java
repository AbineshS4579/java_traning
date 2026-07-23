import java.util.Scanner;

public class strong {
    public boolean strongs(int n){
        int t=n,add=0;
        while(n>0){
            int d=n%10;
            int fact =1;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            add+=fact;

        }
        return t==add;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        strong o=new strong();
       if(o.strongs(n)){
        System.out.println("Strong number");
        return ;
       }
       System.out.println(" no strong");

    }
}
