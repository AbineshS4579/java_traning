import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={2,0,0,6};
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                a[i]=1;
            System.out.print(a[i]);
        }
    }
}
