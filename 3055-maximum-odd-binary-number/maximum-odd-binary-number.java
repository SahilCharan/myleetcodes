class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zcount =0, ocount = 0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i) == '0')
            zcount++;
            else
            ocount++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        ocount--;
        while(zcount!=0)
        {
            sb.insert(0,'0');
            zcount--;
        }
        while(ocount!=0)
        {
            sb.insert(0,'1');
            ocount--;
        }
        return sb.toString();
    }
}