import java.util.*;
public class exceptionhandling {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i=s.nextInt(),j=s.nextInt();
        try{
            int a[]={12,445,6};
            int n=i/j;
            System.out.println(n+" "+a[4]);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
