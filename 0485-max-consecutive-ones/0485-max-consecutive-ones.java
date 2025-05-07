class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
         int currcount = 0;
         for( int num: nums){
            if(num == 1){
                currcount +=1;
            }else{
                maxcount = Math.max(maxcount , currcount);
                currcount =0;
            }

         }
         return Math.max(maxcount, currcount);
    }
}