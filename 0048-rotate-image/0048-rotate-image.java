class Solution {
    public void rotate(int[][] matrix) {
        int n = (matrix[0].length);
        int a;
        int [][]matrix2 = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix2[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = matrix2[n-j-1][i];
            }
        }
    }
}