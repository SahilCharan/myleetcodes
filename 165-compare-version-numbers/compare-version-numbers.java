class Solution {
    public int compareVersion(String version1, String version2) {
        int idx1 = 0, idx2 = 0;
        int l1 = version1.length(), l2 = version2.length();

        while (idx1 < l1 || idx2 < l2) {
            int num1 = 0, num2 = 0;

            // Get the next number in version1
            while (idx1 < l1 && version1.charAt(idx1) != '.') {
                num1 = num1 * 10 + (version1.charAt(idx1) - '0');
                idx1++;
            }

            // Get the next number in version2
            while (idx2 < l2 && version2.charAt(idx2) != '.') {
                num2 = num2 * 10 + (version2.charAt(idx2) - '0');
                idx2++;
            }

            // Compare the numbers
            if (num1 > num2) return 1;
            else if (num1 < num2) return -1;

            // Move to the next number, skip the dot
            idx1++;
            idx2++;
        }

        // If both versions are equal
        return 0;
    }
}
