class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int s = 0;
        int e = 0;
        int n[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                e++;
            }
            else if(nums[i]<pivot){
                s++;
            }
        }
        int i = 0;
        int j = s;
        int k = s+e;
        for(int x=0;x<nums.length;x++){
            if(nums[x]<pivot){
                n[i] = nums[x];
                i++;
            }   
            else if(nums[x]==pivot){
                n[j] = nums[x];
                j++;
            }
            else{
                n[k] = nums[x];
                k++;
            }
        }
        return n;
    }
}