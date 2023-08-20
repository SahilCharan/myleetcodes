class Solution {
    public void sortColors(int[] nums) {
        int one=0,zero=0,two=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        int index = 0;

        while (zero-- > 0) {
           nums[index]=0;
            index++;
        }

        while (one-- > 0) {
            nums[index]=1;
            index++;
        }

        while (two-- > 0) {
            nums[index]=2;;
            index++;
        }
    }

}
