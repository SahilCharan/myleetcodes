class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // minimu time - 1sec max time - max value of the array

        int max = getMax(piles);

        int low = 0, high =  max;
        while(high>=low)
        {
            int mid = (high+low)/2;
            int hour  = getHour(piles,mid);
            if(hour<=h)
            high = mid-1;
            else
            low = mid+1;
        }
        return low;
    }
    public int getMax(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max = arr[i];
        }
        return max;
    }
    public int getHour(int arr[], int mid)
    {
        int h =0;
        for(int i =0;i<arr.length;i++)
        {
            h += Math.ceil((double)(arr[i]) / (double)(mid));
        }
        return h;
    }
}