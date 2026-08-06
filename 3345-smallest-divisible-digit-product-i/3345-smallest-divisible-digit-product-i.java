class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;
        while(true){
            int num = temp;
            int pro = 1;
            while(num>0){
                int rem = num%10;
                if(rem==0)
                    return temp;
                pro*=rem;
                num/=10;
            }
            if(pro%t==0)
                return temp;
            temp++;
       }
    }
}