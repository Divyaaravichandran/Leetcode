class Solution {
    public boolean hasAlternatingBits(int n) {
        String d = Integer.toBinaryString(n);
        for(int i=0;i<d.length()-1;i++)
        {
            if(d.charAt(i)==d.charAt(i+1))
            {
                return false;
            }
        }
        return true;
    }
}