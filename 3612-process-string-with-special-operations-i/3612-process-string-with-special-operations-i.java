class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='*'){
                if(res.length()!=0)
                    res.deleteCharAt(res.length()-1);
            }
            else if(a=='#'){
                res.append(res);
            }
            else if(a=='%'){
                res.reverse();
            }
            else{
                res.append(a);
            }
        }
        return res.toString();
    }
}