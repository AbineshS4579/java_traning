
import java.util.Scanner;

public class space {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine().toLowerCase();
        int c=0;
        String sb=new StringBuilder(st).reverse().toString().trim();
    
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                break;
            }
            c++;
        }
        System.out.println(c);

    }
}
