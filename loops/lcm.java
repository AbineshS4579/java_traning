import java.util.Scanner;

public class lcm {
        public static int get(int x,int y){
          int  l=x*y;
        while(y!=0){
            int k=x%y;
            x=y;
            y=k;
        }   
           
            return l/x;
    }
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int i=s.nextInt(),j=s.nextInt();
     if(i<j){
        i=i+j;
        j=i-j;
        i=i-j;
     }
     System.out.print("LCM:"+get(i,j));

    }
}
