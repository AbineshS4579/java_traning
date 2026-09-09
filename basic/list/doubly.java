import java.util.*;
class node{
    int val;
    node prev;
    node next;
    node(int n){
        val=n;
    }
}
public class doubly{
    static node h;
    public static void in(int n){
        node ne=new node(n);
        if(h!=null){
            ne.next=h;
            h.prev=ne;
        }
        h=ne;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0){
            int x=s.nextInt();
            in(x);
        }
        node t=h;
        while(t.next!=null){
            
            t=t.next;
        }
        while(t!=null){
            System.out.println(t.val);
            t=t.prev;
        }
    }
}