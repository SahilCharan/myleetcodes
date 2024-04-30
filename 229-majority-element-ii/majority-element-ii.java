class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0, count2 =0;
        int cand1 =0, cand2 =0;
         // finding potential majoriry element
         for(int i =0;i<nums.length;i++)
         {
            if((count1 == 0) && (nums[i]!= cand2))
            {
                count1 =1;
                cand1 = nums[i];
            }
            else if(count2 ==0 && nums[i]!=cand1)
            {
                count2=1;
                cand2 = nums[i];
            }
            else if(cand1==nums[i])
            count1++;
            else if(cand2 == nums[i])
            count2++;

            else
            {count1--;
            count2--;}
        }

        List<Integer> ans = new ArrayList<>();
        int th = nums.length/3;

        //second pass to count occurance of potential  majority element

        count1 = 0;
        count2 = 0;

        for(int i =0;i<nums.length;i++)
        {
            if(cand1==nums[i])
            count1++;
            else if(cand2==nums[i])
            count2++;
        }

        //check if the count of the otential majority elements

        if(count1> th)
        ans.add(cand1);

        if(count2>th)
        ans.add(cand2);
       
        return ans;
        
    }
}