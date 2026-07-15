import java.util.Scanner;
public class fibonacci {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int j=0,l=1;     
       for(int i=0;i<n;i++){
        System.out.println(j);       
        int c=j+l;
        j=l;
        l=c;    
       }

   }
}
