import java.util.Scanner;
public class arrayadd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a[]={10,20,30};
        int i=s.nextInt();
        try {
            a[i]=40;
            System.out.println(a[i]);
            throw new Exception("abinesh");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

