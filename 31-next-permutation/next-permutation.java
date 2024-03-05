class Solution {
    public void nextPermutation(int[] nums) {
        //hmko abhi itna samj mein aaya hai ki, array ko piche se travel kro or fir uske baad, 
        //dekho ki array jo hai decending oder meinn sorted hai ki nhi,, or jaha pe hmko breaking point mila wo
        //hoga mera index1 jisko replace krna hai, fir aage --->
        // yadi hmko index 1 mil jaata hai, to fir hm find the first element smaller than nums[idx1-1]  usse swap kr denge, nhi to reverse kr denge
        //ydi nhi milta hai to bss reverse kr denge

        // abhi hmko backtracking nhi aata hai to hm sara permutaions nhi nikal skte hai jisse ki hm, usko ek order mein
        //dusre aaray mein store kr denge or fir uske baad wala indx ko nikal denge , to chlo isko try krte hai

        //sbse phle breaking point nikalte hai

        int idx1 = -1;
        int idx2=-1;// zero nhi le skte kyuki zero bhi ek index hai
        for(int i = nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {idx1 = i;
            break;
            }
        }
        // yadi mera index1 -1 reh gya to array jo hai mera wo descending order mein save hai usko bss reverse kr do
        if(idx1==-1)
        {
            reverse(nums,0);
        }
        // ese nhi hua to bhaiya hm nikalenge uss index wale number se just chota numbr or fir krenge swap
        else
        {
        for(int i = nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[idx1])
            {
                idx2=i;
                break;
            }
        }
            //jb hmko wo idx mil gya jaha pe value of idx2 is samller than idx1 then i will just swap the numbers

            swap(nums,idx1,idx2);
            //to bhaiya mera number swap to ho gya ab kya??
            // ab kro next lexicograph wala jo bhi likha hai usko execute krne k liye minimize krna hoga-  to wo dono index tk kr do sort
            // to lo swap ke baad kr liya sort---> kyu kiya ek baar ye socho number hua 4325413 -> iska answer hai 4323125 isko lane k liye lakin 
            //kya hmko pura sort krna hoga , nhi jo indx1 ka jo value aaya tha wha se end tk i.e sort to the right after swappig

            // to hm kr rahe hai reverse
            reverse(nums,idx1+1);

            //mil gya hmko answer to kr do ab return

           


        }
    }
    

     void reverse(int nums[],int start)
    {
        int left =start;
        int right = nums.length-1;
        while(left<right)
        {
            int temp = nums[left]; 
            nums[left]=  nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
     void swap(int nums[],int idx1, int idx2)
    {
        int temp =nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] =temp;
    }
   
}
