class Solution {
   public boolean isAnagram(String s, String t) {
if(s.length()!=t.length())
return false;
HashMap<Character,Integer> hm=new HashMap<>();

for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
char c1=t.charAt(i);
hm.put(c,hm.getOrDefault(c,0)+1);
hm.put(c1,hm.getOrDefault(c1,0)-1);
}
for(char c:hm.keySet())
{
if(hm.get(c)!=0)
return false;
}
return true;


}
}