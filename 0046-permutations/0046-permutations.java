class Solution {

    public  void getPermu(int [] nums, int Idx,List<List<Integer>> ans ){

        if(Idx==nums.length){
          List<Integer> temp = new ArrayList<>();
            for(int num: nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        for(int  i = Idx;i<nums.length;i++){
            swap(nums, Idx, i);  // Swap current index with i
            getPermu(nums, Idx + 1, ans);
            swap(nums, Idx, i);  
        }

    }
    public void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        getPermu(nums, 0 , ans);
        return ans;
    }
}