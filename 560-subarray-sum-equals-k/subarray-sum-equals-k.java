class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> sumOccurrences = new HashMap<>();
        sumOccurrences.put(0, 1); // Handling cases where the sum from 0 to i equals k
        
        for (int num : nums) {
            sum += num;
            int complement = sum - k;
            if (sumOccurrences.containsKey(complement)) {
                count += sumOccurrences.get(complement);
            }
            sumOccurrences.put(sum, sumOccurrences.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
