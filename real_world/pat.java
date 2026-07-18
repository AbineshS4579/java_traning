
import java.util.Scanner;
public class pat {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<=n;j++) {
//		System.out.print(" ["+i+","+j+"] ");


				
				if(((i+j==4+k)&&i<j)||j==4)
					System.out.print(" *");
					
				
				else
					System.out.print(" ");
				

			
		
			}
			System.out.println();
			k+=1;
		}
	}

}
