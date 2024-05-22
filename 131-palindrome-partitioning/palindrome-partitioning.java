class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res =  new ArrayList<>();
        backTrack(s,0,new ArrayList<>(),res);
        return res;
    }
    private void backTrack(String s,int start,List<String> path, List<List<String>> res){

        if(start == s.length())
        { 
            res.add(new ArrayList<>(path));
            return;
        }
        for(int end =start+1;end<= s.length();end++)
        {
            if(ispalin(s,start,end-1)){
                path.add(s.substring(start,end));
                backTrack(s,end,path,res);
                path.remove(path.size()-1);
            }
        }
    }

    private boolean ispalin(String s,int left, int right)
    {
        while(left<right)
        {
            if(s.charAt(left++)!=s.charAt(right--))
            return false;
        }
        return true;
    }
    
}