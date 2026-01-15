int longestOnes(int* nums, int numsSize, int k) {
    int i = 0, j = 0;
    while (j < numsSize) {
        if (nums[j++] == 0) {
            k--;
        }
        if (k < 0) {
            if (nums[i++] == 0) {
                k++;
            }
        }
    }
    return j - i;
}