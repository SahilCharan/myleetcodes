class Solution {
    public long dividePlayers(int[] skills) {
        Arrays.sort(skills);
        long ans = 0;
        int left =0, right= skills.length-1;
        int sum  = skills[0]+skills[right];
        while(left<right){
            if(skills[left]+skills[right]!= sum){
                return -1;
            }
            ans+=skills[left]*skills[right];
            left++;
            right--;
        }
        return ans;
    }
}