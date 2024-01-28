class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count =0;
        int currcapacity = capacity;
        for(int i =0;i<plants.length;i++)
        {
            if(plants[i]<=currcapacity)
            {
                count++;
                currcapacity = currcapacity-plants[i];
            }
            else
            {
                count = count+ 2*i;
                currcapacity = capacity;
                count++;
                currcapacity = currcapacity-plants[i];
            }

        }
        return count;
        
    }
}