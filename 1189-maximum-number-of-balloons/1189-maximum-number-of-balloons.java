class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char i:text.toCharArray()){
            if(i=='b')    b++;
            else if(i=='a')   a++;
            else if(i=='l')   l++;
            else if(i=='o')   o++;
            else if(i=='n')   n++;
        }
        return Math.min(Math.min(a,b),Math.min(Math.min(l/2,o/2),n));
    }
}