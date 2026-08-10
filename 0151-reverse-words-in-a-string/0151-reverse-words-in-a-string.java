class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i = s.length()-1;i>=0;i--){
            while(i>=0 && ch[i]==' '){
                i--;
            }
            int end = i;
            while(i>=0 && ch[i]!=' '){
                i--;
            }
            for(int j = i+1;j<=end;j++){
                sb.append(ch[j]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}