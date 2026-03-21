class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=1;
        List<Integer> l = new ArrayList<>();
            while(l.size()<k){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    count++;
                    break;
                }
            }
            if(count==0){
                l.add(i);
            }
            i++;
        }
        return (int)l.get(k-1);
    }
}