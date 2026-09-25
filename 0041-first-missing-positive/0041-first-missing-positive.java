class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int i:nums){
            a.add(i);
        }
        int z = 1;
        while(true){
            if(!a.contains(z))
                return z;
            z++;
        }
    }
}