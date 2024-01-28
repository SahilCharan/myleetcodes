class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ip =0,sp =0,count =0;
        while(ip<g.length &&sp<s.length)
        {
            if( g[ip]<=s[sp])
            {
                count++;
                ip++;
                sp++;
            }
            else
            sp++;
        }
        return count;

        
    }
}