class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) // Handle edge cases
            return new int[0];
        ArrayDeque<Integer> deque =  new ArrayDeque<>();
        int result[] = new int[n-k+1];
        for(int i=0;i<k;i++)
        {
            while(!deque.isEmpty()&& nums[i]>nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        result[0] = nums[deque.peekFirst()];

        // Slide the window and update the result array
        for (int i = k; i < n; i++) {
            // Remove indices that are outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            
            // Remove indices of elements smaller than the current element
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            
            // Add the current index to the deque
            deque.offerLast(i);
            
            // Store the maximum element of the current window
            result[i - k + 1] = nums[deque.peekFirst()];
        }

        return result;

    }
}