class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<Pair<Integer,Integer>> heap = new PriorityQueue<>((a,b)->b.getKey()-a.getKey());
        for(int i= 0;i<n;i++)
        {
            heap.add(new Pair<>(score[i],i));
        }

        String rank[] = new String[n];
        int place =1;
        while(!heap.isEmpty())
        {
            Pair<Integer,Integer> pair = heap.poll();
            int ori = pair.getValue();
            if(place ==1)
            rank[ori] = "Gold Medal";
            else if(place ==2)
            rank[ori] ="Silver Medal";
            else if(place ==3)
            rank[ori] = "Bronze Medal";
            else
            rank[ori] = String.valueOf(place);

            place++;
        }
        return rank;
    }
}