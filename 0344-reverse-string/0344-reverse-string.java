class Solution {
    public void reverseString(char[] s) {
        String str  = new String(s);

        StringBuilder reversed =  new StringBuilder(str);
        reversed.reverse();
        for(int i = 0; i<s.length;i++){
            s[i] = reversed.charAt(i);

        }
    }
}