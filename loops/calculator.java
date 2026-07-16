import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.divison");
        System.out.println("5.default");
        int n=s.nextInt();
        int n1=s.nextInt();
        int n2=s.nextInt();
        switch(n){
            case 1:
                System.out.println((n1+n2));
                break;
                case 2:
                System.out.println((n1-n2));
                break;
                case 3:
                System.out.println((n1*n2));
                break;
                case 4:
                System.out.println((n1/n2));
                break;
                default:
                    System.out.println("error");
        }
s.close();




    }
    
}