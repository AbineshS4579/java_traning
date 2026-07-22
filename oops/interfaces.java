interface a{
    int m=20;// interface is not a class and not have object creation
    // only contains   reference method not a definition
    //it defaully take the public and abstract in the front of the methode
    void f();
    void s();
    //interface show the design of the program
}
class b implements a{
    // where you implement the interface their need to use the all methode inthe interface
   public void f(){
        System.out.println("abi");
    }
public void s(){
    
        System.out.println("nesh");
    
}
}
public class interfaces {
    public static void main(String[] args){
        a B=new b();
        B.f();
        B.s();
        System.out.println(a.m);
    }
}
