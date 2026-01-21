class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int l = plants.length;
        int s=0;
        int c=capacity;
        for(int i=0;i<l;i++)
        {
            if(plants[i]<=c)
            {
                s+=1;
                c-=plants[i];
            }
            else
            {
                s += i*2;
                c = capacity;
                if(plants[i]<=c)
                {
                    s+=1;
                    c-=plants[i];
                }
            }
        }
        return s;
    }
}