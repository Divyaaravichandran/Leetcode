class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> n = new HashSet<>();
        for(int j:nums){
            n.add(j);
        }
        int x = k;
        for(int i=1;i<=105;i++){
            if(!n.contains(x)){
                return x;
            }
            else{
                x = i*k;
            }
        }
        return 0;
    }
}