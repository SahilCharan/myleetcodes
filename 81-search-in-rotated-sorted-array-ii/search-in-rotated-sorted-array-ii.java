class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
       int n = Arrays.binarySearch(nums, target);
        if(n>=0)
        return true;
        else return false;
    }
}