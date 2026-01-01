import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i:arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        HashSet<Integer> c = new HashSet<>();
        for(int j:freq.values()){
            if(c.contains(j))   
                return false;
            c.add(j);
        }
        return true;
    }
}