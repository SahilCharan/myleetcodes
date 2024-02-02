class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer>ans = new ArrayList<>();
        String seqD = "123456789";
        //counting the length of low and high by converting in string
        String lowS = Integer.toString(low);
        String highS = Integer.toString(high);
        int lowL = lowS.length();
        int highL = highS.length();
        
        //Iterating trough the range of length
        for(int len = lowL;len<=highL;len++)
        {
            //Generating the substringof length len
            for(int i=0;i<=9-len;i++)
            {
                int num = Integer.parseInt(seqD.substring(i,i+len));
                //checking if num is in the range
                if(num>=low && num <=high)
                ans.add(num);
            }
            }
            return ans;
    }
}