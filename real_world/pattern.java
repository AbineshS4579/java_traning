
import java.util.Scanner;
public class pattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
                
            }
            for(int k=2;k<=i;k++){
                    System.out.print(k);
                }
            System.out.println();
        }
    }
}
