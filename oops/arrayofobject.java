import java.util.Scanner;
class a{

    a(int age,String name){
        
        System.out.println("Age:"+age+"Name:"+name);
    }
}
public class arrayofobject {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    a[] o=new a[2];
    o[0]=new a(23,"abinesh");
    o[1]=new a(34,"boopathi");
}
}
