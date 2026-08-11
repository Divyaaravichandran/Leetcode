class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pos = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int neg = nums[nums.length-1]*nums[0]*nums[1];
        return Math.max(pos,neg);
    }
}