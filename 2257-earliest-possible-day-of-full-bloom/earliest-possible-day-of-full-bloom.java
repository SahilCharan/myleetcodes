class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int arr[][]=new int[growTime.length][2];
        for(int i=0;i<growTime.length;i++){
            arr[i][0]=growTime[i];
            arr[i][1]=plantTime[i];
        }
        Arrays.sort(arr,(a, b) -> b[0]-a[0]);
        int curr=0; //abb tk ka plant time lenge according to logic
        int total=0; //iss me total days kitna hua
        //grow time jiska jada usko phle plant taki jab tk 
        // grow hoga tb tk koi aur bhi plant ho paye aur grow ho paye
        for(int i=0;i<growTime.length;i++){
            total=Math.max(total,curr+arr[i][0]+arr[i][1]);
            curr=curr+arr[i][1];
        }
        return total;
    }
}