class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder merged = new StringBuilder();
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();
    

        int i=0;
        int j=0;
        while (i< word1Char.length && j < word2Char.length) {
            merged.append(word1Char[i]).append(word2Char[i]);
            i++;
            j++;
        }

        if(i < word1Char.length)
            merged.append(word1.substring(i));
        if(j < word2Char.length)
            merged.append(word2.substring(j));

        return merged.toString();
        
    }
}