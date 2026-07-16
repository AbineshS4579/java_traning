import java.util.*;
public class choclate {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n[]={10,20,30};

        int a=0,b=0,c=0;
        for(int v:n){
        for(int i=1;i<=v;i++){
            if(i%3==1)
                a++;
            else if(i%3==2)
                b++;
            else
                c++;
        }
        
    }
    System.out.println(a+"  "+b+"  "+c);
}
}
