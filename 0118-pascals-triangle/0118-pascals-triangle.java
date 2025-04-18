class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows ==0) return result;

        List<Integer> firstRows = new ArrayList<>();
        firstRows.add(1);     
        result.add(firstRows);

        if(numRows == 1) return result;

        for(int i = 1;i<numRows;i++){  // run 4 time each roe from pascla tiem
            List<Integer> prevRows = result.get(i-1);  //store prevrow

            ArrayList<Integer> row = new ArrayList<>(); //new list
            row.add(1);  // first new add 1

            for(int j =0; j<i-1;j++){
                row.add(prevRows.get(j) +prevRows.get(j+1));
            }
            row.add(1);

            result.add(row);

        }


        return result;
    }
}

/*
                         1 
                    1          1
                1         2           1
            1       3            3            1


*/