class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       /*
       HashSet<Character>set = new HashSet<>();
       int end = 0;
       int maxl = 0;

       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        while(set.contains(ch)){
            end++;
            set.remove(ch);
        }
        set.add(ch);
        max = Math.max(max,(i-end+1));
       }
       return max;

       */ 
       int start  = 0;
       int end =0;
       int max = 0;
       
       for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        for(int j =  start;j<end;j++){
            if(s.charAt(j)==ch){
                start=j+1;
                break;
            } 
            }
            end++;
            max = Math.max(max,end-start);
        }
       
       return max;
        }
}