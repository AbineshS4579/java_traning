import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("menu card:\n1.Biriyani\n2.chicken_gravy\n3.muttan_gravy\n4.curd rice\n5.parotta\n6.golli_soda");
        System.out.print("how many dish you need :");
          int k=1;
           int t=0;
        int d=s.nextInt();
        do{
        System.out.print("Enter the dish you need:");     
       
        for(int i=0;i<d;i++){
        int n=s.nextInt();
        switch(n){
            case 1:
                t+=200;
                break;
            case 2:
                t+=150;
                break;
            case 3:
                t+=220;
                break;
            case 4:
                t+=60;
                break;
            case 5:
                t+=25;
                break;
            case 6:
                t+=90;
                break;
            default:
                t+=0;
        }
    }
    
System.out.print("need addtional dish,");
    k+=s.nextInt();
   
    k--;
     d=k;
    }while(k>0);
        System.out.println("total:"+t);


    }}

