class Rectangle{
    int l,b;
    // Rectangle(int l,int b){
    //     this.l=l;
    //     this.b=b;
    // }
    int rune(){
        return l*b;
    }
}
public class classi {
    public static void  main(String[] args){
        Rectangle r=new Rectangle();
        r.l=10;
        r.b=30;
        System.out.println(r.rune());
    }
}
