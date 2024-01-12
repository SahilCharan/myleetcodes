class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dub = new HashSet<>();
        for(int n : nums){
            if(dub.contains(n))
            return true;
            dub.add(n);
        }

        
        return false;
    }
}