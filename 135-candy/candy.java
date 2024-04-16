class Solution {
    public int candy(int[] ratings) {
        int candies[] = new int[ratings.length];
        int len = ratings.length;
        Arrays.fill(candies,1);// sb ko ek candies do
//phle left se right jake dekho or ek taraf se jo bada hai usko ek candies do
        for(int i= 1;i<len;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                candies[i]=candies[i-1]+1;// right wale ka jada hai to jada candies usko do
            }

        }
        // ab left se right jake dekh0 or jiska jada hai , usko assign kro
        for(int i = len-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                candies[i]= Math.max(candies[i],candies[i+1]+1);
            }
        }
        //ab sb candies ko add kr do
        int sum =0;
        for(int cn: candies)
        {
            sum+=cn;
        }
        return sum;
    }
}