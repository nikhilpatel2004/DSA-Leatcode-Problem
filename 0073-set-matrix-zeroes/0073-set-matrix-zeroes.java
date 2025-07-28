class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;

        for (int i = 0; i < n; i++) {  // mark row and col to be zeroed
            if (matrix[i][0] == 0) col0 = 0;
                          for (int j = 1; j < m; j++) {
                          if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        
        for (int i = 1; i < n; i++) { // update matrix  cells 
            for (int j = 1; j < m; j++) {
                      if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    // handke first row 
       
        if (matrix[0][0] == 0) {
                for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

         //handle first col
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
     
        return matrix;
    }
}
