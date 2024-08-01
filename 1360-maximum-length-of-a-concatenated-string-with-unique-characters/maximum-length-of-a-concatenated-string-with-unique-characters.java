class Solution {
    public int maxLength(List<String> arr) {
        String temp= "";
        int n = arr.size();

        return solve(arr, temp, 0, n);
    }
    int solve(List<String> arr, String temp, int index, int n)
    {
        if(index>=n)
        return temp.length();

        int include =0;
        int exclude =0;

        if(hasDublicate(arr.get(index),temp))
        exclude = solve(arr, temp,index+1, n);
        else
        {
            include =  solve(arr, temp+arr.get(index),index+1,n);
            exclude = solve(arr, temp,index+1, n);
        }
        return Math.max(include, exclude);
    }
    boolean hasDublicate(String s1, String s2)
    {
        int arr[] = new int[26];

        for(int i =0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if(arr[ch-'a']>0)
            return true;

            arr[ch-'a']++;
        }
       for(int i =0;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            if(arr[ch-'a']>0)
            return true;
        }
        return false;
    }
}