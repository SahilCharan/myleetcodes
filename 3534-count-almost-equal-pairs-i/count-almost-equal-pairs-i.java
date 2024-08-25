class Solution {

    private boolean isEqual(int num1, int num2) {
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        // EDGE
        while (str1.length() < str2.length()) {
            str1 = "0" + str1;
        }
        while (str2.length() < str1.length()) {
            str2 = "0" + str2;
        }

        // SOLVE
        int cnt = 0; // stores the character diff
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                cnt++;
                list.add(i);
                if (cnt > 2) {
                    return false;
                }
            }
        }

        if (cnt == 0) {
            return true;
        }

        // if character have atmost two diff
        if (cnt == 2) {
            char[] ch = str1.toCharArray();
            int idx1 = list.get(0);
            int idx2 = list.get(1);

            // SWAP IT
            char temp = ch[idx1];
            ch[idx1] = ch[idx2];
            ch[idx2] = temp;

            return String.valueOf(ch).equals(str2);
        }
        return false;
    }

    // DRIVE CODE
    public int countPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (isEqual(nums[i], nums[j])) {
                    res++;
                }
            }
        }
        return res;
    }
}