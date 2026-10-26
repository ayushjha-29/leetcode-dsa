class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] map = new int[128];
        int [] reverseMap = new int[128];

        for(int i=0 ; i<s.length() ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map[c1] != 0 && map[c1] != c2 + 1){
                return false;
            }

            if(reverseMap[c2] != 0 && reverseMap[c2] != c1 + 1){
                return false;
            }

            map[c1] = c2 + 1;
            reverseMap[c2] = c1 + 1;
        }

        return true;
    }
}