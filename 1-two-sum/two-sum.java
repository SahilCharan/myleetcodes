class Solution {
    public int[] twoSum(int[] nums, int target) {
       /*Set<Integer> set = new HashSet<>();
       int ans[] = new int[2];
       for(int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if(set.contains(complement)) {
               ans[0] = getIndex(nums, complement);
               ans[1] = i;
               break;
           }
           set.add(nums[i]);
       }
       return ans;
    }
    
    public int getIndex(int[] nums, int x) { 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == x) return i;
        }
        return -1;
        */

        int left=0,right=nums.length-1;
        for(int i=0;i<nums.length/2;i++){
            if(nums[left]+nums[right]==target)
                return new int[]{left,right};
            for(int j=i+1;j<right;j++){
                if(nums[left]+nums[j]==target)
                    return new int[]{left,j};
                if(nums[j]+nums[right]==target)
                    return new int[]{j,right};
            }
            left++;right--;
        }
        return new int[]{0,0};
    }
}
