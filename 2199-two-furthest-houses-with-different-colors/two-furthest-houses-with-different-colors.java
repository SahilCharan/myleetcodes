class Solution {
    public int maxDistance(int[] colors) {
        int max = -1;
        for (int i = 0; i < colors.length; i++) {
            for (int j = colors.length - 1; j > i; j--) {
                if (colors[i] != colors[j]) {
                    max = Math.max(max, Math.abs(j - i));
                    break; // Break to avoid unnecessary iterations
                }
            }
        }
        return max;
    }
}
