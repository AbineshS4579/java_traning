import java.util.Scanner;

public class upper {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.next(),a="";
        int n=0;
        // int x=s.nextInt();
        // char ch=(char)x;

        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='A'&&st.charAt(i)<='Z'){
                a+=(char)(st.charAt(i)+32);
                n=st.charAt(i)+' ';
            }
            else{
                a+=(char)(st.charAt(i)-32);
            }

        }
        System.out.println(a);
    }
    
}
