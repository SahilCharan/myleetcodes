class Solution {
    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        // Arrays to store words for single digits, tens, and thousands
        String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        String[] thousands = { "", "Thousand", "Million", "Billion" };

        StringBuilder ans =  new StringBuilder();

        int place =0;
        while(num>0){
            //processing the last 3 digits
            if(num%1000 !=0){
                StringBuilder groupresult = new StringBuilder();
                int part = num%1000;

                //handling hunderd
                if(part>=100)
                {
                    groupresult.append(ones[part/100]).append(" Hundred ");
                    part%=100;
                }
                if(part>=20){
                    groupresult.append(tens[part / 10]).append(" ");
                    part %= 10;
                }
                 if (part > 0) {
                    groupresult.append(ones[part]).append(" ");
                }
                groupresult.append(thousands[place]).append(" ");
                ans.insert(0, groupresult);
            }  
            num/=1000;
            place++;
       }
       return ans.toString().trim();
    }
}