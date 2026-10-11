class Solution {
    public boolean isAnagram(String s, String t) {
        int [] frequency = new int[26];

        char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();

        for(int i=0 ; i<s.length() ; i++){
            frequency[str1[i] - 'a']+=1;
        }

        for(int i=0 ; i<t.length() ; i++){
            frequency[str2[i] - 'a']-=1;
        }

        for(int i=0 ; i<26 ; i++){
            if(frequency[i] != 0){
                return false;
            }
        }

        return true;
    }
}