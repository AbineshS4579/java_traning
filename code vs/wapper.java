public class wapper {
    public static void main(String[] args){
        int i=99;
        Integer n=Integer.valueOf(i);  // boxing in the class
        Integer k=i;//auto boxing
        int g=k.intValue();// unboxing primitive from the integer class
        int h=k;//auto inboxing;
        String s="12345",cd="abinesh";
        char[] ch=cd.toCharArray();
        char di=(char)h;

        int d=Integer.parseInt(s);
        System.out.println(i+" "+n+" "+k+" "+g+" "+h+" "+s+" "+d+" "+di+" ");

    }
}
