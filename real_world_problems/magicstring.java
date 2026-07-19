import java.util.Scanner;
public class magicstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] c=s.toCharArray();
        int b[]=new int[26],m=0,n=0,i;
        for(i=0;i<c.length;i++){
            b[c[i]-'a']++;
            if(b[c[i]-'a']>m){
                m=b[c[i]-'a'];
                n=i;
            }
        }
        System.out.println("max ch:"+c[n]+" no.:"+m);
    }
}
