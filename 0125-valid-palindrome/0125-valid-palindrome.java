class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.toLowerCase();
        filtered = filtered.replaceAll("[^a-z0-9]","");

        for(int i=0,j=filtered.length()-1 ; i<j ; i++,j--){
            if(filtered.charAt(i) != filtered.charAt(j)){
                return false;
            }
        }

        return true;
    }
}