public class slide {
    //// brute logic
    // public static void main(String[] args) {
    //  int a[]={20,70,67,89,76},k=2,m=0;
   
    //  for(int i=0;i<=a.length-k;i++){
    //    int s=0;
    //     for(int j=i;j<k+i;j++){
    //         s+=a[j];
    //     }
    //      if(s>m)
    //     m=s;
    //  }
    
    // System.out.println(m);

    // }
    // // slide window
    public static void main(String[] args) {
        int a[]={38,5,65,5,56,54,90},k=2;
        int s=0,m=0;
        for(int i=0;i<k;i++){
            s+=a[i];
        }
        for(int i=k;i<a.length;i++){
            s+=s-a[i-k]+a[i];
            if(s>m)
                m=s;
        }
        System.out.println(m);
                
    }
}
