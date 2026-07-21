import java.util.*;
class bk{
    private int balance;
    bk(int i){
        balance=i;
    }
    void de(int d){
        balance+=d;
    }
    void wi(int w){
        if(balance<w){
            System.out.println("invalid");
        }
        else
            balance-=w;

    }
    int getter(){
        return balance;
    }
}
public class bank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt(),d=sc.nextInt(),w=sc.nextInt();
        bk b=new bk(i);
        b.de(d);
        b.wi(w);
        System.out.println(b.getter());
    }
    
}
