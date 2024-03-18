class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int right = 0;
        while (right < points.length) {
            int currentEnd = points[right][1];
            count++;
            while (right < points.length && points[right][0] <= currentEnd) {
                right++;
            }
        }
        return count;

    }
}