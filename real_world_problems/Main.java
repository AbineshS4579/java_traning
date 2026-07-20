import java.util.Scanner;
class bank{
    private int balance;
    bank(int i){
        balance=i;
    }
    void de(int d){
        balance+=d;
    }
    void with(int w){
        if(balance<w)
            System.out.println("invalied");
        else
            balance-=w;
    }
    int getter(){
        return balance;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt(),d=sc.nextInt(),w=sc.nextInt();
        bank b=new bank(i);
        b.de(d);
        b.with(w);
        System.out.println(b.getter());
    }
    
}
