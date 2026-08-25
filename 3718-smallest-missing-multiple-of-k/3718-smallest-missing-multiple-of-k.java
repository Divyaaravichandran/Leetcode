class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                a.add(nums[i]);
            }
        }
        /*for(int i=0;i<a.size()-1;i++){
            if(a.get(i)==a.get(i+1)){
                a.remove(a.get(i));
            }
        }*/
        HashSet<Integer> hs = new HashSet<>(a);
        
        ArrayList<Integer> b = new ArrayList<>(hs);
        
        Collections.sort(b);
        for(int i=0;i<b.size();i++){
            if(k*(i+1)!=b.get(i)){
                return k*(i+1);
            }
        }
        return (b.size()+1)*k;
        
    }
}