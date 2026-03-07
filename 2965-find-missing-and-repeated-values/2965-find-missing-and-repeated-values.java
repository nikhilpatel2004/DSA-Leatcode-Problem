class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int total = n * n;
        int[] freq = new int[total + 1]; //frequency array bna rhe hai  kyuki hm index  1 -> 4 use kr rhe hai 

        for (int i = 0; i < n; i++) {  // अब हम grid के हर number का count बढ़ा रहे हैं।
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }


        }

        int repeat = -1;
        int missing = -1;

        for (int i = 1; i <= total; i++) {
            if(freq[i] == 2){
                repeat = i;
            }
            if(freq[i] == 0){
                missing = i;
            }
        }

        return new int[]{repeat, missing};
    }
}