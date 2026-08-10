class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] e = new int[(nums.length+1)/2];
        int[] o = new int[nums.length/2];
        int ei = 0;
        int oi = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                e[ei++] = nums[i];
            else
               o[oi++] = nums[i];
        }
        Arrays.sort(e);
        Arrays.sort(o);
        int x = 0;
        int y = o.length-1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i] = e[x++];
            }
            else{
                nums[i] = o[y--];
            }
        }
        return nums;
    }
}