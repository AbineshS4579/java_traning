import java.util.*;

public class exception {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            flag = false;
            System.out.println(e.getMessage());
        }
    }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

