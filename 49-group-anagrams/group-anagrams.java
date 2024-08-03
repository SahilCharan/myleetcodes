class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map= new HashMap<>();

        for(String s : strs)
        {
            String sort = sorts(s);
            List<String> l = map.getOrDefault(sort,new ArrayList<>());
            l.add(s);
            map.put(sort,l);
        }
        list.addAll(map.values());
        return list;
    }
    String sorts(String s)
    {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}