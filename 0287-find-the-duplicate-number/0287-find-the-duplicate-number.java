class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!a.containsKey(nums[i])){
                a.put(nums[i],i);
            }
            else{
                return nums[i];
            }
        }
        return 0;
    }
}