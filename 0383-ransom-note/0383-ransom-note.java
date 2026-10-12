class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] frequency = new int[26];

        for(int i=0 ; i<ransomNote.length() ; i++){
            frequency[ransomNote.charAt(i) - 'a'] +=1;
        }

        for(int i=0 ; i<magazine.length() ; i++){
            frequency[magazine.charAt(i) - 'a'] -=1;
        }

        for(int i=0 ; i<26 ; i++){
            if(frequency[i] > 0){
                return false;
            }
        }

        return true;
    }
}