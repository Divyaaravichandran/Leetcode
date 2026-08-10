class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> h = new HashSet();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        int c = 1;
        while(h.contains(c)){
            c++;
        }
        return c;
    }
}