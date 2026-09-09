class Solution {
    public long countCommas(long n) {
        if(n<=999)
            return 0;
        long c = 0;
        long st = 1000;
        while(st<=n){
            c += n-st+1;
            st*=1000;
        }
        return c;
    }
}