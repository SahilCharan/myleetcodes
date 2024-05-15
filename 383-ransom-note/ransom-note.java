class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: magazine.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:ransomNote.toCharArray())
        {
            if(map.containsKey(c)&&map.get(c)>=1)
            {
              int curr = map.get(c);
               map.put(c,curr-1);
            }
            else
            return false;
        }
        return true;
    }
}