import java.util.Scanner;
class rectangles{
    private int length;
    private int width;
    public rectangles(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int area(){
        return length*width;
    }
}
public class rectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int width=sc.nextInt();
        rectangles rect=new rectangles(length,width);
        System.out.println(rect.area());
    }
}