// Approach: 
// Make 4 funtions allowing right, down, left, up traversal.
// Then for moving inwards,  
// Reduce the top index and run right again.
// Reduce the right index and run down again.
// Reduce the bottom index and run left again.
// Reduce the left index and run up again.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        ArrayList<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            Right(matrix, top, left, right, result);
            top++;

            Down(matrix, top, bottom, right, result);
            right--;

            if (top <= bottom) {
                Left(matrix, bottom, left, right, result);
                bottom--;
            }

            if (left <= right) {
                Up(matrix, top, bottom, left, result);
                left++;
            }
        }

        return result;
    }

    public void Right(int[][] matrix, int row, int left, int right, List<Integer> result) {
        for (int i = left; i <= right; i++) {
            result.add(matrix[row][i]);
        }
    }
    public void Down(int[][] matrix, int top, int bottom, int col, List<Integer> result) {
        for (int i = top; i <= bottom; i++) {
            result.add(matrix[i][col]);
        }
    }
    public void Left(int[][] matrix, int row, int left, int right, List<Integer> result) {
        for (int i = right; i >= left; i--) {
            result.add(matrix[row][i]);
        }
    }
    public void Up(int[][] matrix, int top, int bottom, int col, List<Integer> result) {
        for (int i = bottom; i >= top; i--) {
            result.add(matrix[i][col]);
        }
    }
}