import java.util.Scanner;
public class octtobin{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String o=s.next();
    int n=Integer.parseInt(o,8);
    String b=Integer.toBinaryString(n);
    System.out.println(b);
}
}