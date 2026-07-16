package real_world;
import java.util.Scanner;
public class married {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); 
        System.out.print("Are you Driver Enter d ,otherwise n:");
        char dr=s.next().charAt(0);
        if(dr=='d'){ 
        System.out.print("m-Marreid   u-Unmarreid  :");
        char g=s.next().charAt(0);
        if(g!='m'){
            System.out.print("gender = F-female , M-male :");
            char ge=s.next().charAt(0);
            System.out.print("age :");
            int age=s.nextInt();
            if((ge=='M'&&age>=30)||(ge=='F'&&age>=25))
                System.out.println("eligible to get the loan");
            return;
        }
        System.out.println("not eligible for loan");
        return;
    }
    System.out.println("Drivers only eligible for the loan");
    }
}
