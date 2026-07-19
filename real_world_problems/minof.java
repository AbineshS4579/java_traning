import java.util.*;
public class minof {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],s=0,av,k=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i+=2){
            s=0;
            k=i+2;
            
                if(k>=n)
                    break;
            for(int j=i;j<k;j++){
                s+=a[j];  
            }
            av=s/2;
            for(int j=0;j<n;j++){
            if(av>a[j])
                a[j]=0;
        }
        }
        for(int t:a){
            System.out.print(t);
        }        
    }
}
