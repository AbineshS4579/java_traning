
import java.util.Scanner;
public class pattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int r=i;r>=0;r--){
                System.out.print("* ");
            }
            System.out.println();
        }
        // for(int i=1;i<=5;i++){
        //     for(int g=1;g<=5-i;g++){
        //         System.out.print(".");
        //     }
            
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int k=2;k<=i;k++){
        //             System.out.print(k);
        //         }
        //     System.out.println();
        // }
    }
}
