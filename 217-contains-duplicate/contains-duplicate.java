class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for(int e:nums){
            if(!set.add(e)) return true;
        }

        
        return false;
    }
}