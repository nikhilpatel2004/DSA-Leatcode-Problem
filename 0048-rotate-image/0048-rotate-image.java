class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j<n;j++){
                int temp  = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;


            }

        }
        for(int i = 0;i<n ;i++){
            reverse(matrix[i]);
        }

    }

    void reverse(int [] row){
    int st = 0 , ed = row.length-1;
    while(st<ed){
        int temp  = row[st];
        row[st] = row[ed];
        row[ed]= temp;
        st++;
        ed--;
    }

    }
}