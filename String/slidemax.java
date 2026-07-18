import java.util.*;
public class slidemax {
  
    public int[] maxSlidingWindow(int[] nums, int k) {
        int s=0;
        int p=k,j=0;
        int[] a=new int[nums.length-k+1];
        while(nums.length>=p){
            int m=Integer.MIN_VALUE;
        for(int i=s;i<p;i++){
            if(nums[i]>m)
            m=nums[i];
        }
        a[j]=m;
        j++;
        p++;
        s++;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int k=s.nextInt();
        slidemax o=new slidemax();
        System.out.println(o.maxSlidingWindow(nums,k));
    }
}

