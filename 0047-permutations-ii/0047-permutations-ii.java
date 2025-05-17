class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean [] used = new boolean [nums.length];
        backtrack(nums , new ArrayList<>(), used , res);
        return res;
        
    }
    private void backtrack(int [] nums, List<Integer> tempList , boolean[] used,List<List<Integer>> res){
        if(tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = 0 ;i<nums.length; i++){
            if(used[i]) continue;

            if(i>0  && nums[i] == nums[i-1] && !used [i-1]) continue;

            used[i] = true;
            tempList.add(nums[i]);
            backtrack(nums, tempList , used , res);



    used[i] = false;
    tempList.remove(tempList.size()-1);
        }
    }
}