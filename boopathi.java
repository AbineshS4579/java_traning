import java.util.Scanner;

public class boopathi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
				if(j==0||i==0||j==n-1||i==n-1||i==n/2)
					System.out.print("@ ");
				else
					System.out.print("  ");

			}
            for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(j==0||i==0||j==n-1||i==n-1)
					System.out.print("$ ");
				else
					System.out.print("  ");

			}
            for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(j==0||i==0||j==n-1||i==n-1)
					System.out.print("$ ");
				else
					System.out.print("  ");

			}
            for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(i==0||j==0||i==n/2||j==n-1&&i<=n/2)
					System.out.print("# ");
				else
					System.out.print("  ");

			}
            for(int j=i;j<n-1;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				if(j==0||j==i)
				System.out.print("  & ");
			else
				if(i==(n/2)+1)
					System.out.print("  & ");
				else
					System.out.print("    ");
				
			}
          	for(int j=i;j<n;j++) {
					System.out.print("  ");
			}
            
			for(int j=0;j<n;j++){
				if(i==0||j==n/2)
					System.out.print("& ");
				else
					System.out.print("  ");

			}
            for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(j==0||i==n/2||j==(n-1))
					System.out.print("& ");
				else
					System.out.print("  ");

			}
            for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(i==0||j==n/2||i==n-1)
					System.out.print("# ");
				else
					System.out.print("  ");

			}
             for(int j=1;j<3;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(i==0||j==0||i==n/2||j==n-1&&i<=n/2||i==j&&i>=n/2)
					System.out.print("# ");
				else
					System.out.print("  ");

			}
            for(int j=i;j<n-1;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				if(j==0||j==i)
				System.out.print("  & ");
			else
				if(i==(n/2)+1)
					System.out.print("  & ");
				else
					System.out.print("    ");
				
			}
            for(int j=i;j<n;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				if(i==0||j==n/2||i==n-1&&j<=n/2||j==0&&i>=n/2)
					System.out.print("# ");
				else
					System.out.print("  ");

			}
            for(int j=i;j<n-1;j++) {
					System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				if(j==0||j==i)
				System.out.print("  & ");
			else
				if(i==(n/2)+1)
					System.out.print("  & ");
				else
					System.out.print("    ");
				
			}
            System.out.println();
        }
    }
}
