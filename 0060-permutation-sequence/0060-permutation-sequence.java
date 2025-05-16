class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> number = new ArrayList<>();
        int fact = 1;

        for(int i  = 1 ; i<=n; i++){
            number.add(i);
            fact*= i;
      
     }
     k = k -1;
     StringBuilder result =new StringBuilder();

     for(int i =0; i<n;i++){
        fact = fact /(n-i);
        int index = k/fact;
        result.append(number.get(index));
        number.remove(index);
        k =k%fact;
     }
     return result.toString();
        
    }
}