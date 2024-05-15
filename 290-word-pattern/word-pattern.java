class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        if (str.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c))
                map.put(c, str[i]);
            else if (!map.get(c).equals(str[i]))
                return false;

            if (!map2.containsKey(str[i]))
                map2.put(str[i], c);
            else if (map2.get(str[i]) != c)
                return false;

        }
        return true;

    }
}