class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length; // mtrsi ki size store kr rhe hia
        int cols = matrix[0].length;


        boolean fristRowZero  = false; // frist row mekoi zero ho ya column ho isliye
        boolean fristColZero  = false;
         // Step 1: Check if first row and first column have any zeros

        for(int i=0;i<rows; i++){ // frist column ko chek kr rhe  agr zero hot true kr do
            if(matrix[i][0] == 0) fristColZero = true;
        }

        for(int j = 0; j<cols; j++){ // fist row chek krrhe hai agr zero ho to true kr do
            if(matrix[0][j] == 0) fristRowZero = true;
        }

// Step 2: Use first row and first column as markers 
// frist row column ko travser kr rhe hai
        for(int i = 1; i<rows ;i++){
            for(int j=1;j<cols; j++){
                if(matrix[i][j] == 0){
                matrix[i][0] = 0;
                matrix[0][j] = 0;
                }
            }
        }
        
        // Step 3: Set zeroes using markers in first row/column
        for(int i = 1; i<rows; i++){
            for(int j = 1;j<cols;j++){
                if(matrix[i][0] ==0 || matrix [0][j] ==0){
                    matrix[i][j]=0;
                }
            }

        }
        if(fristColZero){
            for(int i =0;i<rows ;i++){
                matrix[i][0] = 0;
            }
        }
        if(fristRowZero){
            for(int j = 0; j<cols; j++){
                matrix[0][j] = 0;
            }
        }

        
    }
}