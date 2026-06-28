class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxlen = Math.min(s.length(),1);
        while(end<s.length()){
            char c = s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start+=1;
            }
            seen.add(c);
            int size = end-start+1;
            maxlen  = Math.max(maxlen,size);
            end+=1;
        }
        return maxlen;
    }
}