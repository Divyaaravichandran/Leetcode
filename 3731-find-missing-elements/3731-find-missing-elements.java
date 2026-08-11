class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> s = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int i=min+1;i<max;i++){
            if(!s.contains(i))
                l.add(i);
        }
        return l;
    }
}