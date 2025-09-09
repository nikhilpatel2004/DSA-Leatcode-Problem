class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer>ans = new ArrayList<>();
       Map<Integer , Integer> freq = new HashMap<>();

       for(int num :nums){ // chek frequeny
        freq.put(num , freq.getOrDefault(num,0)+1);
       }

//check loanly
for(int num :nums){
if(freq.get(num)==1 && !freq.containsKey(num-1) && !freq.containsKey(num+1)){
    ans.add(num);
}
}
return ans;



        
    }
}