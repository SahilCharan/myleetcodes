class Solution {
    public int appendCharacters(String s, String t) {
        int slength = s.length();
        int tlength =  t.length();
        int i =0, j=0;
        for(i=0;i<slength && j<tlength;i++){
            if(s.charAt(i)== t.charAt(j))j++;
        }
        return tlength -j;
    }
}