class Solution {
    public int function(int[] arr, int n){
        if(n == 1)
            return arr[0];
            
        for(int i=0;i<n-1;i++){
            arr[i] = (arr[i] + arr[i+1])%10; 
        }
        return function(arr,n-1);
    }
    public int triangularSum(int[] nums) {
        return function(nums,nums.length);
    }
    
    
}