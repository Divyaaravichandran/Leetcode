
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==-2147483648)
            return false;
        String z = Integer.toBinaryString(n);
        int c = 0;
        for(int i=0;i<z.length();i++){
            char a = z.charAt(i);
            if(a=='1')
                c++;
        }
        if(c==1)
            return true;
        return false;
    }
}