class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        char[] arr = s.toCharArray();
        int max = 0;
        int x = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1')
                x++;
        }
        if(x<2){
            return 0;
        }
        for(int a=0;a<arr.length;a++){
            if(arr[a]=='1'){
                int c = 0;
                for(int b=a+1;b<arr.length;b++){
                    if(arr[b]=='0'){
                        c++;
                        continue;
                    }
                    else{
                        max = Math.max(max,c);
                        break;
                    }
                }
            }
        }
        return max+1;
    }
}