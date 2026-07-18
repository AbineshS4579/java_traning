

public class max {
    public static void main(String[] args){
        int[] a={10,20,30,40,50};
        int k=2,m=0;
        for(int i=0;i<=a.length-k;i++){
            int s=0;
            for(int j=i;j<k+i;j++){
                s+=a[j];
            }
            if(s>m){
                m=s;
            }
        }
        System.out.print(m);
    }
}
