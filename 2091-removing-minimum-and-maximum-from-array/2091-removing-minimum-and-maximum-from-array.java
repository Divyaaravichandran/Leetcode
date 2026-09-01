import java.util.*;
class Solution {
    public int minimumDeletions(int[] nums) {
        int ans;
        int minindex = 0;
        int maxindex = 0;
        int ans1 = 1;
        int ans2 = 1;
        int ans3 = 2;
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2){
            return 2;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[minindex]){
                minindex = i;
            }
            if(nums[i]>nums[maxindex]){
                maxindex = i;
            }
        }

        //Delete from first
        if(minindex<maxindex)
            ans1 += maxindex;
        else if(minindex>maxindex)
            ans1 += minindex;

        //Delete from end
        if(minindex<maxindex){
            for(int i=nums.length-1;i>minindex;i--){
                ans2+=1;
            }
        }
        else if(minindex>maxindex){
            for(int i=nums.length-1;i>maxindex;i--){
                ans2+=1;
            }
        }

        //Delete from start and end
        if(minindex<maxindex){
            ans3+=minindex;
            for(int i=nums.length-1;i>maxindex;i--){
                ans3+=1;
            }

        }
        else if(minindex>maxindex){
            ans3+=maxindex;
            for(int i=nums.length-1;i>minindex;i--){
                ans3+=1;
            }
        }

        ans = Math.min(ans1,ans2);
        return Math.min(ans,ans3);
    }
}