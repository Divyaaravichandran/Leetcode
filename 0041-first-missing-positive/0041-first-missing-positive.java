class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                a.add(nums[i]);
        }
        for(int i=1;i<=a.size();i++){
            if(a.contains(i))
                continue;
            return i;
        }
        return a.size()+1;
    }
}