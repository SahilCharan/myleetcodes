public class Solution{
public String convert(String s, int numRows) {
    if (numRows == 1) {
        return s;
    }

    char[][] grid = new char[numRows][s.length()];

    int row = 0;
    int col = 0;
    boolean goingDown = false;

    for (char c : s.toCharArray()) {
        grid[row][col] = c;

        if (row == 0 || row == numRows - 1) {
            goingDown = !goingDown;
        }

        row += goingDown ? 1 : -1;
        col++;
    }

    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < s.length(); j++) {
            if (grid[i][j] != '\0') {
                answer.append(grid[i][j]);
            }
        }
    }

    return answer.toString();
}
}
