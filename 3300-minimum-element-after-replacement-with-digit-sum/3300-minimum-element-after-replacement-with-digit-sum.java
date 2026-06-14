class Solution {
    public int minElement(int[] nums) {
        int m = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int r = 0;
            while(nums[i]!=0){
                int d = nums[i]%10;
                r+=d;
                nums[i]/=10;
            }
            nums[i] = r;
            m = Math.min(r,m);
        }
        return m;
    }
}