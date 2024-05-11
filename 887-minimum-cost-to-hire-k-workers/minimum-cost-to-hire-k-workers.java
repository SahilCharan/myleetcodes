class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        // current ratio * total quality = total wage for this group.
        int n = wage.length;
        double[][] workers = new double[n][2];
        for (int i = 0; i < n; i++){
            workers[i] = new double[]{(double)wage[i]/quality[i], (double)quality[i]};
        }
        // sort by wage rate, 
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
        // maxheap, poll() max quality; get min qsum;
        PriorityQueue<Double> pq = new PriorityQueue<>((a,b)->Double.compare(b, a));
        double qsum = 0, res = Double.MAX_VALUE;
        for (double[] work : workers){
            qsum += work[1];
            pq.offer(work[1]);
            if (pq.size() > K) qsum -= pq.poll();
            if (pq.size() == K) res = Math.min(res, qsum * work[0]);
        }
        return res;
    }
}