class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min_dif = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min_dif = Math.min(min_dif,arr[i]-arr[i-1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min_dif){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}