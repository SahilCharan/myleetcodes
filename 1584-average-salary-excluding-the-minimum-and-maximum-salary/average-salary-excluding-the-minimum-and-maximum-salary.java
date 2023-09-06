class Solution {
    public double average(int[] salary) {
        int minimumindex = mi(salary);
        int maxindex = maxind(salary);
        int sum = 0,count=0;
        for(int i = 0 ; i< salary.length;i++)
        {
            if(i == minimumindex || i == maxindex)
            continue;
            else
            {sum+=salary[i];
            count++;}
        }
        return (double)sum/count;
    }
    public int mi(int[] salary)
    {
        int minimum = salary[0];
        int mind = 0;
        for(int i = 1;i <salary.length;i++)
        {
            if(salary[i]<minimum)
            {
                minimum = salary[i];
                mind = i;
            }
        }
        return mind;
    }
    public int maxind(int[] salary)
    {
        int max = salary[0];
        int mind = 0;
        for(int i = 1;i<salary.length;i++)
        {
            if(salary[i]>max)
            {
                max = salary[i];
                mind = i;
            }
        }
        return mind;
        


    }
}