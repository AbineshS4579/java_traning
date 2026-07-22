import java.util.Scanner;
public class mukesk {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
             //M
            for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(j==i||j==0)
					System.out.print("& ");
				else
					System.out.print("  ");

			}
			for(int j=0;j<n;j++){
				if(j+i==n-2||j==n-2)
					System.out.print("& ");
				else
					System.out.print("  ");

			}
            //u
              for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(j==0||j==n-1||i==n-1)
					System.out.print("$ ");
				else
					System.out.print("  ");

			}
            //K
             for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++) {
				if(j==n/2||i==j&&i>=n/2||i+j==(n-1)&&i<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
            //E
			
			for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(j==0||i==0||i==n-1||i==n/2)
					System.out.print("% ");
				else
					System.out.print("  ");

			}
            //S
			for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(j==0&&i<=n/2||i==0||i==n-1||i==n/2||j==(n-1)&&i>=n/2)
					System.out.print("<>");
				else
					System.out.print("  ");

			}
            //H
			for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(j==0||i==n/2||j==(n-1))
					System.out.print("& ");
				else
					System.out.print("  ");

			}
            System.out.println();
        }
    }
}
