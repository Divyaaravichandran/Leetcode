class Solution {
    public boolean isPalindrome(int x) {
        long rev=0;
        int temp=x;
        while(x!=0){
            int d = x%10;
            rev = rev*10+d;
            x/=10;
        }
        if(rev!=temp || temp<0)
            return false;
        return true;
    }
}