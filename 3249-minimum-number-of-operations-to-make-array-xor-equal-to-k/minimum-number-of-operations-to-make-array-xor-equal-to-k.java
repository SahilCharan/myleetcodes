class Solution {
    public int minOperations(int[] nums, int k) {
        int finalXor =0;
        //XOR of all the integers in the array.
        for(int n:nums)
        {
            finalXor = finalXor^n;
        }
        int count =0;
        // keep iterating untill both k and finalXor becomes zero
        while(k>0 || finalXor>0)
        {
            //k%2 returns the rightmost bit of k
            //finalXor %2 return the rightmost bit in finalXor
            // increment the counter , if they are uequal

            if((k%2)!= (finalXor %2))
            {
                count++;
            }
            // remove the last bit from both the integers
            k/=2;
            finalXor/=2;
        }

        return count;
    }
}