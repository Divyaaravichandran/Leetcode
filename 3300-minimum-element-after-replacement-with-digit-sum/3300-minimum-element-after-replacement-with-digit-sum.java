class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int r = 0;
            while(nums[i]!=0){
                int d = nums[i]%10;
                r+=d;
                nums[i]/=10;
            }
            nums[i] = r;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}