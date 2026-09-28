class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int max = 0;
        for(char i:s.toCharArray()){
            if(i=='('){
                depth++;
            if(depth>max)
                max = depth;
            }
            else if(i==')'){
                depth--;
            }
        }
        return max;
    }
}