import java.util.Scanner;
public class quarient {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt(),y=s.nextInt();
        System.out.println((x>0?(y>0?"1":"4"):(y>0?"2":"3")));
    }
}
