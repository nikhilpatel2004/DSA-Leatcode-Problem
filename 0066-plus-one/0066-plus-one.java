class Solution {
    public int[] plusOne(int[] digits) {
     for(int i = digits.length-1;i>=0;i--){
        if(digits[i]<9){
            digits[i] ++;
            return digits;
        }
        digits [i] = 0; // Carry krne k liye agar last m 999 hai to

     }
  // Agar sabhi digits 9 the (like 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1; // pehle index pe 1, baaki default 0
        return result;
    }
}