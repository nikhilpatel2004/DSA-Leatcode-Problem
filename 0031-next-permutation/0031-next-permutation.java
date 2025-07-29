class Solution {
    public void nextPermutation(int[] nums) {
      int n = nums.length;
      int idx = -1;


      //step1  find the break point

      for(int i = n-2; i>=0;i--){
        if(nums[i]<nums[i+1]){
            idx = i;
            break;
        }
      }

      //step2 if no breakpoint find revser entire array

      if(idx == -1){
        reverse(nums, 0 , n-1);
        return;
      }

      //step3  find next greater elemnt to swap

      for(int i = n-1; i>idx ;i--){
        if(nums[i]> nums[idx]){
            // swap
            int temp = nums[i];
            nums[i] =nums[idx];
            nums[idx] =temp;
            break;
        }
      }

      reverse(nums, idx+1, n-1);
    }

    private void reverse(int[] nums, int st, int ed) {
        while (st < ed) {
            int temp = nums[st];
            nums[st] = nums[ed];
            nums[ed] = temp;
            st++;
            ed--;
        }
    }
}
