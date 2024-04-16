class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] candies = new int[len];
        Arrays.fill(candies, 1); // Initialize each child with 1 candy
        
        // First pass: from left to right
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1; // Give more candy to the right if its rating is higher
            }
        }
        
        // Second pass: from right to left
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1); // Take maximum of current value and the one from the right
            }
        }
        
        // Sum up all the candies
        int sum = 0;
        for (int candy : candies) {
            sum += candy;
        }
        
        return sum;
    }
}
