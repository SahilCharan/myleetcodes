public class Solution {
    public static int majorityElement(int []v) {
        // Write your code here
        int cnt=0,el=Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++)
        {
            if(cnt==0)
            {
                cnt=1;
                el=v[i];
            }
            else
            if(v[i]==el)
            cnt++;
            else
            cnt--;
        }
        int cnt1=0;
        for(int i=0;i<v.length;i++)
        {
            if(v[i]==el)
            cnt1++;
        }
        if(cnt1>v.length/2)
        return el;
        else
        return -1;
    }
}