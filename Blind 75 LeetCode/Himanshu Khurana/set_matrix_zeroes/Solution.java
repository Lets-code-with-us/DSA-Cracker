class Solution {
    public void setZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        // Find which rows and columns contain zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Set zeros for rows
        for (int i = 0; i < rows; i++) {
            if (rowZero[i]) {
                for (int j = 0; j < cols; j++) {
                    mat[i][j] = 0;
                }
            }
        }

        // Set zeros for columns
        for (int j = 0; j < cols; j++) {
            if (colZero[j]) {
                for (int i = 0; i < rows; i++) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
