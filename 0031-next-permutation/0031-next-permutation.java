class Solution {
    public void nextPermutation(int[] nums) {

        //Finding breaking point
        int index = -1; 
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                index = i-1;
                break;
            }
        }

        //Swap
        if (index != -1) {
            for (int i = nums.length - 1; i > index; i--) {
                if (nums[index] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
        }

        //Reverse
        int left = index+1;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;                
            left++;
            right--;
        }
    }
}