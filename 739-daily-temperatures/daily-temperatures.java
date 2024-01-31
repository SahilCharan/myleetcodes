class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        int[] nextWarmers = new int[101]; // We only have temperatures from 30 to 100

        for (int i = temperatures.length - 1; i >= 0; i--) {
            int nearestWarmer = Integer.MAX_VALUE;
            for (int t = temperatures[i] + 1; t <= 100; t++) {
                if (nextWarmers[t] != 0) {
                    nearestWarmer = Math.min(nearestWarmer, nextWarmers[t]);
                }
            }
            if (nearestWarmer != Integer.MAX_VALUE) {
                ans[i] = nearestWarmer - i;
            }
            nextWarmers[temperatures[i]] = i;
        }

        return ans;
    }
}
