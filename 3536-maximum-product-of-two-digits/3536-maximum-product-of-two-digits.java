class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> l=new ArrayList<>();
        while(n!=0){
            int temp=n%10;
            l.add(temp);
            n/=10;
        }
        int max1 = 0;
        int max2 = 0;
        for (int i : l) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }
        }
        return max1 * max2;
    }
}