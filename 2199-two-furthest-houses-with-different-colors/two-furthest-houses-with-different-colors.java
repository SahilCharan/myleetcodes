class Solution {
    public int maxDistance(int[] arr) {
        // HashMap<Integer>map=new HashMap<>();
        int n=arr.length;
    	int ans1=0;
    	int ans2=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=arr[0]){
                ans1=i;
                break;
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=arr[n-1]){
                ans2=(n-i)-1;
                break;
            }
        }


        return Math.max(ans1,ans2);
    }
}