class Solution {
    public int jump(int[] nums) {
        int totalJumps = 0 ,destination  = nums.length-1 , coverage = 0 , lastJumpIdx = 0;
       if(nums.length ==1)return 0;


       for(int i = 0;i<nums.length;i++){
          
          coverage = Math.max(coverage , i+nums[i]); // (0 , 0+2) = 2

          if(i== lastJumpIdx){ // i== 0
           lastJumpIdx = coverage;// 2
           totalJumps++;


           if(coverage >= destination){
            return totalJumps;
           }
 
          }

       }
        return totalJumps;
    
    }
  

}