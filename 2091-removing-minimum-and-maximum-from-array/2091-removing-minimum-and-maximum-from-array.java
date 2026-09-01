import java.util.*;
class Solution {
    public int minimumDeletions(int[] nums) {
        int minindex = 0;
        int maxindex = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[minindex])
                minindex = i;
            if(nums[i]>nums[maxindex])
                maxindex = i;
        }

        int left = Math.min(minindex, maxindex);
        int right = Math.max(minindex, maxindex);

        int f = right+1;
        int b = nums.length-left;
        int fb = (left+1) + (nums.length-right);
        
        return Math.min(f,Math.min(b,fb));
    }
}