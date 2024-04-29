class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
        return -1;

        int index = haystack.indexOf(needle);
        return index;

    }
}