import java.util.*;
public class sort {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
    //  int n=s.nextInt();
    //  int a[]=new int[n];
    //   int r=0;
    //  for(int i=0;i<n;i++){
    //     a[i]=s.nextInt();
       
    //     if(a[i]>r){
    //         r=a[i];

    //     }
    //  }
    //  for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         if(a[i]<a[j]){
    //             int t=a[i];
    //             a[i]=a[j];
    //             a[j]=t;
    //         }
    //     }
        
    //  }
    // //  System.out.println(r);
    //  for(int k:a)
    // System.out.print(k+" ");
    int n=s.nextInt(),m=s.nextInt();
    int[][] a=new int[n][m],b=new int[n][m],c=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=s.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            b[i][j]=s.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    // for(int h:c){
    //     System.out.print(h);
    // }
   
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            
            for(int k=0;k<m;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
            
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }

    }
}
