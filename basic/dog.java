import java.util.Scanner;
public class dog {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
        a[i]=s.nextInt();
     }for(int k=n-1;k>=0;k--){
     System.out.print(a[k]+" "); 
     }
    }
}
