import java.util.*;
class Solution {
    public int minimumDeletions(int[] nums) {
        
        int minindex = 0;
        int maxindex = 0;
        int ans1 = 1;
        int ans2 = 1;
        int ans3 = 2;
        int ans;
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
        System.out.println(ans1);

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
        System.out.println(ans2);

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
        System.out.println(ans3);

        if(ans1<=ans2 && ans1<=ans3){
            ans = ans1;
            return ans;
        }
        if(ans2<=ans1 && ans2<=ans3){
            ans = ans2;
            return ans;
        }
        if(ans3<=ans1 && ans3<=ans2){
            ans = ans3;
            return ans;
        }
        return 0;
    }
}