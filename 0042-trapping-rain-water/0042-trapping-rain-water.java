class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(start<end){
            rightMax = Math.max(rightMax,height[end]);
            leftMax = Math.max(leftMax,height[start]);
            if(rightMax<leftMax){
                total+=rightMax-height[end];
                end--;
            }
            else{
                total+=leftMax-height[start];
                start++;
            }
        }
        return total;
    }
}