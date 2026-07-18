import java.util.*;
public class seconlar {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    for(int  i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    // Arrays.sort(a);
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
    }
    System.out.println("2nd large:"+a[n-2]);
    }
}
