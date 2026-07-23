import java.util.*;
public class removedupicate {
    public static void main(String[] args){
        int nums[]={1,2,2,2,3,3,4,4,5,6,6,7};
     int j=0;
    
     for(int i=1;i<nums.length;i++){
        if(nums[j]!=nums[i]){
            j++;
           
            nums[j]=nums[i];
            

        }
     }
     for(int h:nums){
        System.out.print(h);
     }
     System.out.println("count:"+j+1);
       
    }
}
