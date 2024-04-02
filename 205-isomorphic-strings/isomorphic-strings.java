class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;

        Map<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            char c = t.charAt(i);
            if(!map.containsKey(ch))
            {
                if(!map.containsValue(c))
                map.put(ch,c);
                else
                return false;
                
            }
            else
            if(map.containsKey(ch))
            {
                if(map.get(ch)!=c )
                return false;
            }
        }
        return true;
    }
}