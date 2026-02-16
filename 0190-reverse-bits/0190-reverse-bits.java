class Solution {
    public int reverseBits(int n) {
        int total = 0;
        for(int i=0;i<32;i++)
        {
            total<<=1;
            total |= (n&1);
            n>>=1;
        }
        return total;
    }
}