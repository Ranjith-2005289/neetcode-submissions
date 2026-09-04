class Solution {

    public void setZeroes(int[][] matrix) {

        boolean firstrow = false;
        boolean firstcol = false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find zeros and use first row/column as markers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {

                    if (i == 0)
                        firstrow = true;

                    if (j == 0)
                        firstcol = true;

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Set inner cells to zero using the markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // If first row originally had a zero
        if (firstrow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // If first column originally had a zero
        if (firstcol) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
