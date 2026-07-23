import java.util.Scanner;
public class left {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a[]={20,50,45,67,89},t[]=new int[5];
        for(int i=4;i>=0;i--){
            t[(2+i)%5]=a[i];
        }
        // for(int i=0;i<2;i++){
        //     for(int j=4;j>0;j--){
        //         int t=a[j];
        //         a[j]=a[j-1];
        //         a[j-1]=t;
        //     }
        // }
        for(int i:t){
            System.out.print(i+" ");
        }
    }
}
