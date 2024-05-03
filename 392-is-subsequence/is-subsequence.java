class Solution {
    public boolean isSubsequence(String s, String t) {
        
        // if(s.length()>t.length())
        // return false;
        // int left =0;
        // int left1 =0;

        // while(left<s.length()&& left1<t.length())
        // {
        //     if(s.charAt(left)==t.charAt(left1))
        //     {
        //         left++;
        //         left1++;
        //     }
        //     else
        //     left1++;

            
        // }

        // if(left == s.length())
        // return true;
        // else
        // return false;

       
   
  int i=0,j=0;
    int n=t.length();
    int m=s.length();
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();

    if(m<1)
        return true;

    while(i<n){
        if(tt[i]==ss[j]){
            j++;
        }
        i++;
        
    if(j==m)
        return true;
    }

        return false;
    }
}