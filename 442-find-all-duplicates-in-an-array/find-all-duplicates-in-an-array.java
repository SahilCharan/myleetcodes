public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> seen = new HashSet<>(nums.length + 1); // Use initial capacity for efficiency
        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        return duplicates;
    }
}
