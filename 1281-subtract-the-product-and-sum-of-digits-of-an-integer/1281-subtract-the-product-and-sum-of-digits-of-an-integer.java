class Solution {
    public int subtractProductAndSum(int n) {
        int add = 0;
        int pro = 1;
        while(n!=0)
        {
            int rem = n%10;
            add+=rem;
            pro*=rem;
            n/=10;
        }
        return pro-add;
    }
}