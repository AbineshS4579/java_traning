import java.util.*;
public class election { 
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the population:");
        int n=s.nextInt(),t=0,d=0;
        boolean o;
        
        int[] a=new int[n];
        do{
            o=false;
            System.out.println("1- for 'TVK'\n0-for 'DMK'");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            if(a[i]==0)
                d++;
            else
                t++;
        }
        if(d<t){
            System.out.println("TVK-is win the election");
        }
        else if(d>t)
            System.out.println("DMK-is win the election");
        else{
            System.out.println("re-election");
            o=true;

        }
    }while(o);


}}
