class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        Stack<Integer> rightMax = new Stack();

        //right max
        rightMax.push(height[height.length-1]);//pushing last element

        for(int i=height.length-2;i>=2;i--){ //1st building is leftmax,we're starting from 2nd building, so this loop is until the 3rd building
            rightMax.push(Math.max(rightMax.peek(),height[i]));
        }

        int totWater = 0;
        for(int i=1;i<height.length-1;i++){
            int mini = Math.min(rightMax.peek(),leftMax);
            int temp = mini-height[i];
            totWater+=Math.max(0,temp);

            rightMax.pop();
            leftMax = Math.max(leftMax,height[i]);
        }
        return totWater;
    }
}