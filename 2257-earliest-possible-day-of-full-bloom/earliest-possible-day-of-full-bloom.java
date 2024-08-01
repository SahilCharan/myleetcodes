import java.util.*;

class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        // Array of indices
        Integer[] indices = new Integer[plantTime.length];
        for (int i = 0; i < plantTime.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on growTime in descending order
        Arrays.sort(indices, (a, b) -> growTime[b] - growTime[a]);

        int maxBloomDays = 0;
        int currPlantDay = 0;

        for (int i : indices) {
            currPlantDay += plantTime[i];
            maxBloomDays = Math.max(maxBloomDays, currPlantDay + growTime[i]);
        }

        return maxBloomDays;
    }
}
