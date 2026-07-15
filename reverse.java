import java.util.Scanner;
public class reverse {
    public static void main(){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt(),y=s.nextInt();
        int[][] a=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=y-1;j>-1;j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
