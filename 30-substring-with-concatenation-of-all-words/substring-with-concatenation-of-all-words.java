class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int k = words[0].length() * words.length;
        int n = words[0].length();
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        int i = 0, j = 0;
        while (j < s.length()) {
            if (j - i + 1 == k) {
                String sub = s.substring(i, j + 1);
                HashMap<String, Integer> map2 = new HashMap<>();
                int p = 0;
                while (p < sub.length()) {
                    String temp = sub.substring(p, p + n);
                    map2.put(temp, map2.getOrDefault(temp, 0) + 1);
                    p += n;

                }
                if (map.equals(map2))
                    list.add(i);

                i++;
            }
            j++;

        }
        return list;

    }
}
