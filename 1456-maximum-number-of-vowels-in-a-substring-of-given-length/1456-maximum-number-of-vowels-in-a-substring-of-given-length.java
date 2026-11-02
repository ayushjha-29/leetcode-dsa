class Solution {
    public int maxVowels(String s, int k) {
        int curr = 0;

        for(int i=0 ; i<k ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                curr++;
            }
        }

        int max = curr;

        for(int i=0,j=k ; j<s.length() ; i++,j++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                curr--;
            }

            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u'){
                curr++;
            }

            max = Math.max(max,curr);
        }

        return max;
    }
}