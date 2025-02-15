class Solution {
    public int[][] modifiedMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            ans[i] = Arrays.copyOf(mat[i], n);
        }
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, mat[i][j]);
            }
            for (int i = 0; i < m; i++) {
                if (mat[i][j] == -1) {
                    ans[i][j] = max;
                }
            }
        }
        return ans;
    }
}