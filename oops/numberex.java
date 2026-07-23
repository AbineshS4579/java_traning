import java.util.Scanner;
public class numberex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        String s=sc.next();
        float n=Float.parseFloat(s);
        }catch(Exception e){
            System.out.println(e/*.getMessage()ṇ */);
        }finally{
            System.out.println("end");
        }
    }
}
