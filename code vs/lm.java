import java.util.Scanner;
public class lm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1&&n==0)
            System.out.println("no due");
        else if(n>1&&n<10)
            System.out.println("50rs fine");
        else if(n<20&&n>10)
            System.out.println("100rs fine");
        else if(n<30&&n>20)
            System.out.println("150rs fine");
        else if(n<40&&n>30)
            System.out.println("200rs fine");
        else
            System.out.println("terminate ");
    }
}
