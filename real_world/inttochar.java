import java.util.Scanner;
public class inttochar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l=65;
        int n=s.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int k=n-1;k>=1+i;k--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)l+"  ");
                l+=3;
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int k=n-1;k>=1+i;k--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)l+"  ");
                l+=3;
            }
            System.out.println();
        }
    }}

