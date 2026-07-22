class bank{
    private int balance;
    void initial(int  i){
        balance+=i;
    }
    void with(int w){
        balance-=w;
    }
    int runn(){
        return balance;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        bank b=new bank();
        // b.balance=1000; here not able to access the privatevariable
        b.with(1000);
        b.initial(50000);
        System.out.println(b.runn());
    }
}
