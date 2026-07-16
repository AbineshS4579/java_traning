

import java.util.Arrays;
import java.util.Scanner;
class medians {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int si=nums1.length+nums2.length;
        int[] com=new int[si];
        for(int i=0;i<nums1.length;i++){
            com[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            com[i+nums1.length]=nums2[i];
        }
        Arrays.sort(com);
        if(si%2==0){
            int a=(si/2)-1,b=a+1;
            double mt=(com[a]+com[b])/2.0;
            return mt;
        }double nt=com[si/2];
        return nt;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt(),n=s.nextInt();
        int[] nums1=new int[m],nums2=new int[n];
        for(int i=0;i<m;i++){
            nums1[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            nums2[i]=s.nextInt();
        }
        double nt=findMedianSortedArrays(nums1,nums2);
    }
}
