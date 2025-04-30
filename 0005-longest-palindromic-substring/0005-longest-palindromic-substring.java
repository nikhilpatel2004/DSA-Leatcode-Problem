class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length()<1) return "";

        int st  = 0  , ed = 0;


        for(int  i = 0; i<s.length();i++){
           int len1 = expendFromCenter(s, i ,i);  // odd
           int len2 = expendFromCenter(s, i ,i+1); //even
           int len  = Math.max(len1,len2);

           if(len>(ed-st)){
            st = i-(len-1)/2;
            ed = i+(len/2);

           }
        }
        return s.substring(st, ed+1);
    }

    public int expendFromCenter(String s , int  left , int right ){
        while(left>= 0 && right< s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;

    }
}