import java.util.Scanner;
public class diwali {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=240,t=180,k=0,g=0;
        int p=sc.nextInt();
        
        for(g=1;g<=p&&k+5*g<=n-t;g++){
               k+=5*(g);
        }
        System.out.println(g-1);

    }
}
