import java.util.*;
class stringtonum{
    public static int myAtoi(String st) {
        int n,c=0;
        st.trim();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='a'&&st.charAt(i)<='z'||st.charAt(i)>='A'&&st.charAt(i)<='B'||st.charAt(i)=='-')
               break;

            if(st.charAt(i)>='0'&&st.charAt(i)<='9'){

                n=st.charAt(i)-'0';
                c=c*10+n;
            }
        }
        if(st.startsWith("-")){
            return -c;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.next();
        System.out.println(myAtoi(st));
    }
}