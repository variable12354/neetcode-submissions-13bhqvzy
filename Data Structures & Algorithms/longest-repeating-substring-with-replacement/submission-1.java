class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] freqArray = new int[26]; 

        for(int right =0;right<s.length();right++){
            
            freqArray[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq,freqArray[s.charAt(right) - 'A']);

            int windowLength = right - left + 1;

            if(windowLength - maxFreq > k){
                freqArray[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,right - left + 1);
        }
        return maxLength;
        
    }
}
