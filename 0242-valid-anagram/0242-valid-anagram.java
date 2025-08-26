class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        // char ch1[] = s.toCharArray();
        // Arrays.sort(ch1);

        //   char ch2 [] = t.toCharArray();
        // Arrays.sort(ch2);

        // return Arrays.equals(ch1, ch2);

        int new1 [] =  new int[26];
        int new2  [] = new int[26];
        for(int i = 0;i<s.length();i++){
            char ch  = s.charAt(i);
            int idx = ch-'a';
            new1[idx]++;
            
        }
          for(int i = 0;i<t.length();i++){
            char ch  = t.charAt(i);
            int idx = ch-'a';
            new2[idx]++;


        }
        return Arrays.equals(new1, new2);
        

    }


}