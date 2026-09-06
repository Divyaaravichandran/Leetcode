class Solution {
    public int hammingWeight(int n) {
        String z = Integer.toBinaryString(n);
        int c = 0;
        for(int i=0;i<z.length();i++){
            char a = z.charAt(i);
            if(a=='1')
                c++;
        }
        return c;
    }
}