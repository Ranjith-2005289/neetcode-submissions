class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < (n + 1) / 2; i++) {

            for (int j = 0; j < n / 2; j++) {

                // bottom left → temp
                int temp = matrix[n - 1 - j][i];

                // bottom right → bottom left
                matrix[n - 1 - j][i] =
                    matrix[n - 1 - i][n - 1 - j];

                // top right → bottom right
                matrix[n - 1 - i][n - 1 - j] =
                    matrix[j][n - 1 - i];

                // top left → top right
                matrix[j][n - 1 - i] =
                    matrix[i][j];

                // temp (bottom left) → top left
                matrix[i][j] = temp;
            }
        }
    }
}