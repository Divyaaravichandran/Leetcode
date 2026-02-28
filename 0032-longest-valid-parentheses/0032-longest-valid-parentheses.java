class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> a = new Stack<>();
        a.push(-1);
        int l = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                a.push(i);
            else
            {
                a.pop();
                if(a.isEmpty())
                    a.push(i);
                else
                    l = Math.max(l,i-a.peek());
            }
        }
        return l;
    }
}