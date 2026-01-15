int longestOnes(int* nums, int numsSize, int k) {
    int left=0,zc=0,maxlen=0;
    for(int j=0;j<numsSize;j++)
    {
        if(nums[j]==0)
            zc++;
        while(zc>k){
            if(nums[left]==0)
                zc--;
            left++;
        }
        int cl = j-left+1;
        if(cl>maxlen)
            maxlen = cl;
    }
    return maxlen;
}