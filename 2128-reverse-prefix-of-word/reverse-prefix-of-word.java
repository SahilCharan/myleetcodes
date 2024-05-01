class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if(idx ==-1)
        return word;
        
        // String w ="";
        // for(int i = idx;i>=0;i--)
        // {
        //     char c = word.charAt(i);
        //     w= w+c;
        // }
        // w= w+word.substring(idx+1);
        // return w;

        StringBuilder sb = new StringBuilder(word.substring(0,idx+1));
        return sb.reverse().toString()+ word.substring(idx+1);
    }
}