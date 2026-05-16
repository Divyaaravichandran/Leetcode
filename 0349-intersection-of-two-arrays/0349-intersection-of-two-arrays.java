class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> l = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])
                {
                    l.add(nums1[i]);
                }
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}