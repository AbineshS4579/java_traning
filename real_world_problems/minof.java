import java.util.*;
public class minof {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],s=0,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        double av=(a[n-1]+a[n-2])/2.0;
                 for(int k=0;k<n;k++){

                    if(a[k]>=av)
                        s+=a[k];
                }
                if(s<min)
                    min=s;


        // for(int i=0;i<n-1;i++){
                       
        //     for(int j=i+1;j<n;j++){
        //         s=0;
        //         double av=(a[i]+a[j])/2.0;
            
        //         for(int k=0;k<n;k++){

        //             if(a[k]>=av)
        //                 s+=a[k];
        //         }
        //         if(s<min)
        //             min=s;
        //     }

        // }
         System.out.println(min);
        }
        
           
        
    }

