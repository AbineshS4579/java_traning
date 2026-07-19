import java.util.*;
public class jar {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      int ja=sc.nextInt();
      int[] ar=new int[ja];
      for(int i=0;i<ja;i++){
        ar[i]=sc.nextInt();
      }
      int a=0,b=0,c=0;
      for(int j=0;j<ja;j++){
      for(int i=1;i<=ar[j];i++){
        if(i%3==1)
            a++;
        else if(i%3==2)
            b++;
        else
            c++;
      }
    }
    System.out.println("a:"+a+" b:"+b+" c:"+c);
    }
}
