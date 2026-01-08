class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        else
        {
            int rev = 0;
            int t = x;
            while(t!=0)
            {
                int digit = t%10;
                rev = rev*10 + digit;
                t/=10;
            }
            return(rev==x);
        }
    }
}