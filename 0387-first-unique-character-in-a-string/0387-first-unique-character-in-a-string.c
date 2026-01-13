int firstUniqChar(char* s) {
    for(int i=0;s[i]!='\0';i++)
    {
        int c = 0;
        for(int j=0;s[j]!='\0';j++)
        {
            if(i!=j && s[i]==s[j] ){
                c++;
                break;
            }
        }
        if(c==0)
            return i;
    }
    return -1;
}