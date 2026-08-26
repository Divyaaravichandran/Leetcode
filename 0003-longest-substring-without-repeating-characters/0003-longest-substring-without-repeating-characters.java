class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q = new LinkedList<>();
        int max = 0;
        for(int i=0;i<s.length();i++){
            while(q.contains(s.charAt(i))){
                q.poll();
            }
            q.add(s.charAt(i));
            max = Math.max(max,q.size());
        }
        return max;
    }
}