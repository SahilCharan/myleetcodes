class Solution {
    public long pickGifts(int[] gifts, int k) {
      PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int i =0;i<gifts.length;i++){
        pq.offer(gifts[i]);
      }
      while(k>0)
      {
        int x = pq.poll();
        int sq = (int)Math.floor(Math.sqrt(x));
        pq.offer(sq);
        k--;
      }
      long sum =0;
      while(!pq.isEmpty()){
        sum+=pq.poll();
      }
      return sum;


    }
}