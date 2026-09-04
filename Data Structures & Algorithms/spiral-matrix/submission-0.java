class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int rowstart = 0;
        int rowend = matrix.length - 1;

        int colstart = 0;
        int colend = matrix[0].length - 1;

        while (rowstart <= rowend && colstart <= colend) {

            // 1. Left → Right
            for (int j = colstart; j <= colend; j++) {
                ans.add(matrix[rowstart][j]);
            }
            rowstart++;

            // 2. Top → Bottom
            for (int i = rowstart; i <= rowend; i++) {
                ans.add(matrix[i][colend]);
            }
            colend--;

            // 3. Right → Left
            if (rowstart <= rowend) {
                for (int j = colend; j >= colstart; j--) {
                    ans.add(matrix[rowend][j]);
                }
                rowend--;
            }

            // 4. Bottom → Top
            if (colstart <= colend) {
                for (int i = rowend; i >= rowstart; i--) {
                    ans.add(matrix[i][colstart]);
                }
                colstart++;
            }
        }

        return ans;
    }
}