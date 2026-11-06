class Solution {
    public int characterReplacement(String s, int k) {
        int [] frequency = new int [26];

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int right = 0 ; right < s.length() ; right++){

            char c = s.charAt(right);
            frequency[c - 'A']++;
            
            maxFreq = Math.max(maxFreq , frequency[c - 'A']);

            while((right - left + 1) - maxFreq > k){
                frequency[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen , right - left + 1);
        }

        return maxLen;
    }
}