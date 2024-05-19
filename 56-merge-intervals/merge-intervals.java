class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list =  new ArrayList<>();
        for(int[] inter : intervals)
        {
            if(list.isEmpty()|| list.get(list.size()-1)[1]<inter[0])
            list.add(inter);
            else
            list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1],inter[1]);

        }
        return list.toArray(new int[list.size()][]);

    }
}