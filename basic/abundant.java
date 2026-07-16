
import java.util.Scanner;
public class abundant {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
                c+=i;
			}
		}
        if(c>n)
            System.out.println("abundant");
        else
            System.out.println("not abundant");
	}
}
