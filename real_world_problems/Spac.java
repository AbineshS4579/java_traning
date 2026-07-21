import java.util.*;
public class Spac {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int ct=0;
        for(char c:st.toCharArray()){
        if(c==' ')
            ct++;

        }
        System.out.println(ct);
    }

}
