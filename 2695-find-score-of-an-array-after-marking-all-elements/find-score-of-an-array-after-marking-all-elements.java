class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> { // arranging the numbers as in ascending order but if
                                                                  // two numbers are same then one with lower index,
                                                                  // gets higher priority
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
        long score = 0;
        boolean vis[] = new boolean[nums.length];//taking the visted array to mark the elements which are not marked
        int totalMarked = 0;
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[] { nums[i], i });
        }
        while (!pq.isEmpty()) {
            int curr[] = pq.poll();
            int a = curr[0];// choosing the smallest element
            int b = curr[1];
            if (!vis[b]) {
                score += a;// if not marked then add the element;
                vis[b] = true;// mark as visited
                totalMarked++;
                if (b + 1 < nums.length) { // mark the neighbours
                    vis[b + 1] = true;
                   // score += nums[b + 1];
                    totalMarked++;
                }
                if (b - 1 >= 0) {
                    vis[b - 1] = true;
                   // score += nums[b - 1];
                    totalMarked++;
                }
            }
            //if (totalMarked == nums.length)
              //  break;
        }
        return score;
    }
}