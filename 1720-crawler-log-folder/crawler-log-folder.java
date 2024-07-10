class Solution {
    public int minOperations(String[] logs) {
        int count  =0;
        for(String s : logs)
        {
            if(s.equals("./"))
            continue;
            else
            if(s.equals("../"))
            {
                if(count>0)
                count--;
            }
            else
            count++;

        }
        return count;
    }
}