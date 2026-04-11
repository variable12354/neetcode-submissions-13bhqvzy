class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];

        char[] sstring = s.toCharArray();
        char[] tstring = t.toCharArray();

        for(int i =0;i<s.length();i++){
            freq[sstring[i] - 'a']++;
            freq[tstring[i] - 'a']--;
        }

        for(int f:freq){
            if(f > 0) return false;
        }

        return true;
    }
}
