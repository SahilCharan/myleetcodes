class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans =  new ArrayList<>();
        ans.add(1);
        long a =1;
        for(int i=0;i<rowIndex;i++)
        {
            a = a*(rowIndex-i);
            a=a/(i+1);
            ans.add((int)a);
        }
        return ans;
    }
}