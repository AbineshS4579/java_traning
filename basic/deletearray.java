import java.util.Scanner;
public class deletearray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        for(int i=0;i<n;i++){
            if(k==a[i]){
                for(int j=i;j<n;j++){
                    a[j]=a[j+1];
                }
                
            }
            n--;
        }
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
