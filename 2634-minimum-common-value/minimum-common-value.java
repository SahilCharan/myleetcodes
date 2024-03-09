class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer>set = new HashSet<>();
        for(int i : nums1)
        {
            set.add(i);
        }
        for(int i : nums2)
        {
            if(set.contains(i))
            return i;
        }
        return -1;
    }
}