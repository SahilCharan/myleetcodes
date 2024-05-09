class Solution {
    public static long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness);
        long res = happiness[happiness.length - 1];
        int j = 1;
        k = k - 1;
        for (int i = happiness.length - 2; k > 0; i--) {
            if (happiness[i] - j < 0)
                res += 0;
            else
                res += happiness[i] - j;
            
            j++;
            k--;
        }
        return res;

    }

}