class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = getSmoothedValue(img, i, j, m, n);
            }
        }

        return result;
    }

    private int getSmoothedValue(int[][] img, int row, int col, int m, int n) {
        int sum = 0;
        int count = 0;

        for (int i = Math.max(0, row - 1); i <= Math.min(m - 1, row + 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(n - 1, col + 1); j++) {
                sum += img[i][j];
                count++;
            }
        }

        return sum / count;
    } 
    
}