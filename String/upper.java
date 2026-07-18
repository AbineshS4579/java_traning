import java.util.Scanner;

public class upper {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.next(),a="";
        // int x=s.nextInt();
        // char ch=(char)x;

        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='A'&&st.charAt(i)<='Z'){
                char cr=st.charAt(i);
                a+=(char)(cr+32);
            }
            else{
                char cr=st.charAt(i);
                a+=(char)(cr-32);
            }

        }
        System.out.println(a);
    }
    
}
