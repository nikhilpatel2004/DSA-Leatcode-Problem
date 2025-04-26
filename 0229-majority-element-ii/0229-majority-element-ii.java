class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Integer cand1 = null;
        Integer cand2 = null;

        int count1 = 0;
        int count2 = 0;

        for(int i = 0;i<n;i++){
            if(cand1!= null && nums[i]==cand1){
                count1++;
            }else if(cand2!= null && nums[i]==cand2){
                count2++;
            }else if(count1==0){
                cand1 = nums[i];
                count1 = 1;
            }else if(count2==0){
                cand2 = nums[i];
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

    List<Integer> res = new ArrayList<>();
    int freq1 = 0;
    int freq2= 0;

    for(int num:nums){
        if(num== cand1)
       freq1++;
  else if(num== cand2)
  freq2++;
    }
    if(freq1>n/3){
        res.add(cand1);
    }
     if(freq2>n/3){
        res.add(cand2);
    }
return res;

  
    }
}