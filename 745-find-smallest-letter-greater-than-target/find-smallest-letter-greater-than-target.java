class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int high = letters.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);

            if (letters[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low < letters.length ? letters[low] : letters[0];
    }
}
