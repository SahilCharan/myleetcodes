class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =  new ArrayList<>();
        generatesets(nums,new ArrayList<Integer>(),0,ans);
        return ans;
    }
    public void generatesets(int nums[], List<Integer>current,int index,List<List<Integer>>ans)
    {
        ans.add(new ArrayList<>(current));
        for(int i =index; i<nums.length;i++)
        {
            current.add(nums[i]);
            generatesets(nums,current,i+1,ans);
            current.remove(current.size()-1);
        }


    }
     
}