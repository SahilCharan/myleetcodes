/*class Solution {
  public static String intToRoman(int num) {
    String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
}
    }

*/

class Solution {

        public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        while(num>=1000){s.append('M');num -= 1000; }
        if(num>=900){s.append("CM");num -= 900; }
        if(num>=500){s.append('D');num -= 500; }
        if(num>=400){s.append("CD");num -= 400; }
        while(num>=100){s.append('C');num -= 100; }
        if(num>=90){s.append("XC");num -= 90; }
        if(num>=50){s.append('L');num -= 50; }
        if(num>=40){s.append("XL");num -= 40; }
        while(num>=10){s.append('X');num -= 10; }
        if(num==9){s.append("IX");num -= 9; return s.toString(); }
        if(num>=5){s.append('V');num -= 5; }
        if(num==4){s.append("IV");num -= 4; return s.toString(); }
        while(num>=1){s.append('I');num -= 1; }
        return s.toString();
    }
}
// class Solution {
//     public String intToRoman(int num) {
//         String roman="";
//         int[] values= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
//         String[] rom={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
//         for(int pos=12;num>0;--pos)
//         {
//             while(num>=values[pos])
//             {
//                 roman+=rom[pos];
//                 num-=values[pos];
//             }
//         }
//         return roman;
//     }
// }