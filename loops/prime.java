
import java.util.*;

public class prime {
    public static boolean check(int j){
    for(int i=2;i<j;i++){
        if(j%i==0){
            return false;
        } 
     }
     return true;
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number:");
        int c=0;
        int n=s.nextInt();
        for(int j=2;j<n;j++){
            if(check(j))
                c++;
            System.out.println(j);
    }
    System.out.println("count:"+c);

}
}
