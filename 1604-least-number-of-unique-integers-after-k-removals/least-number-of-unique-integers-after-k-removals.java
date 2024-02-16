class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr)
        {
           map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int n: map.values())
        {
            list.add(n);
        }
        Collections.sort(list);
        int count =0;
        for(int i =0;i<list.size();i++)
        {
            if(k>list.get(i))
            {
                k-=list.get(i);
                list.set(i,0);
            }
            else
            {
                list.set(i,list.get(i)-k);
                k=0;
            }
            if(list.get(i)!=0)
            count++;
        }
        return count;
    }
}