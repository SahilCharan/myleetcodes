class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row =0;row<numRows;row++)
        {
            ans.add(getRow(row));
        }
        return ans;
        
    }
    public List<Integer> getRow(int row)
    {
        List<Integer> a = new ArrayList<>();
        int ans=1;
        a.add(1);
        for(int col=0;col<row;col++)
        {
            ans = ans*(row-col);
            ans = ans/(col+1);
            a.add((int)ans);
        }
        return a;
    }
}