class Solution {
    public boolean isFascinating(int n) {
        String s = Integer.toString(n);
         s = s+ Integer.toString(2*n)+Integer.toString(3*n);
         Set<Character> ans = new HashSet<>();
         if(s.contains("0")) return false;
         if(s.length()>9) return false;
         for(char ch : s.toCharArray())
         {
             ans.add(ch);
         }
         if(ans.size() == 9)
         return true;
         else
         return false;

    }
}