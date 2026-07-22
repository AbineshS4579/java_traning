
import java.util.Scanner;
abstract class shape{
    public abstract void circle(double r);
    public abstract void rectangle(double l,double b);
}
class A extends shape{
    public void circle(double r){
        System.out.printf("%.2f",Math.PI*r*r);
    }
    public void rectangle(double l,double  b){
    System.out.printf("%.2f",l*b);
}

}

public class abstractio {
    public static void main(String[] args){
       
        Scanner s=new Scanner(System.in);
        String st=s.next().toLowerCase();
        shape sh=new A();
        if(st.equals("circle")){
            double r=s.nextDouble();
            
           sh.circle(r);
        }
        else{
            double l=s.nextDouble(),b=s.nextDouble();
           
           sh.rectangle(l,b);
        }
    }
}
