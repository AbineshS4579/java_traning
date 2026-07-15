import java.util.Scanner;
public class hcf{
    public static int get(int x,int y){
        while(y!=0){
            int k=x%y;
            x=y;
            y=k;
        }      
            return x;
    }
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int i=s.nextInt(),j=s.nextInt();
     if(i<j){
        i=i+j;
        j=i-j;
        i=i-j;
     }
     System.out.print("HCF:"+get(i,j));

    }
}