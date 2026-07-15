
import java.util.Scanner;
public class fact {
    public static int factorial(int x){
        if(x<=0){
            return 1;
        }
        return x*factorial(x-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println(factorial(x));
    }
}

