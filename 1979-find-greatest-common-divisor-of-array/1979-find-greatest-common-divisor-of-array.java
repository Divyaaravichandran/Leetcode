class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }
        return GCD(min,max);
    }
    public int GCD(int a,int b){
        if(b==0)
        {
            return a;
        }
        return GCD(b,a%b);
    }
}