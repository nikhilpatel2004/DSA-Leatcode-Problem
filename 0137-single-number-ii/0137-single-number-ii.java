class Solution {
    public int singleNumber(int[] nums) {
        int ans1 = 0 , ans2 = 0;
        for(int num :  nums){
            ans1 = (ans1^num) &~ans2;
            ans2 = (ans2^num) &~ans1;
        }
        return ans1;
        
    }
}