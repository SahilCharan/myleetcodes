class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7)
        return true;
        else
        if(n<10)
        return false;
        HashSet<Integer> set = new HashSet<>();


        while(n>9)
        {
            int sum =0;
            while(n>0){
            int d = n%10;
            sum+=d*d;
            n/=10;
            }
             if(sum==1 || sum==7)
                return true;
             else
             if(sum<10)
               return false;
            if(set.contains(sum))
            return false;
            else
            n =sum;
            
    }
    return true;
}
}