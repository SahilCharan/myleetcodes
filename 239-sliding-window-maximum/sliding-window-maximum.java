class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] results = new int[nums.length-k+1];   			// nums.length-k+1	
        int[] leftMax = new int[nums.length];
        int[] rightMax = new int[nums.length];
        leftMax[0] = nums[0];
        for (int i=1; i<leftMax.length; i++) {    					
            leftMax[i] = (i%k == 0)? nums[i] : Math.max(nums[i], leftMax[i-1]);   // (i%k == 0) → reset
        }
        rightMax[rightMax.length-1] = nums[nums.length-1];
        for(int i=(rightMax.length-1)-1; i>=0; i--) {   			// 'i=(nums.length-1)-1'
            rightMax[i] = (i%k == 0)? nums[i] : Math.max(nums[i], rightMax[i+1]); 
        }
        for(int i=0; i<results.length; i++) { 				// Important!!! NOT "i<results.length-k+1;"	
            results[i] = Math.max(leftMax[i+k-1], rightMax[i]);  	// leftMax[i+k-1]
        }        
        return results;
    }
}