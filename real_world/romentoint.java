import java.util.Scanner;
class romentoint {
    public static int romanToInt(String s) {
        int c=0;
        int[] st=new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'I':
                st[i]=1;
                break;
                case 'V':
                st[i]=5;
                break;
                case 'X':
                st[i]=10;
                break;
                case 'L':
                st[i]=50;
                break;
                case 'C':
                st[i]=100;
                break;
                case 'D':
                st[i]=500;
                break;
                case 'M':
                st[i]=1000;
                break;
                default:
                st[i]=0;
            }
        }
        for(int j=0;j<s.length();j++){
            for(int k=j+1;k<s.length();k++){
                if(st[j]<st[k]){
                    st[j]=st[k]-st[j];
                    st[k]=0;

                }
                
            }
            c+=st[j];
        }
        return c;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.next();
        
        System.out.println(romanToInt(st));
    }
}