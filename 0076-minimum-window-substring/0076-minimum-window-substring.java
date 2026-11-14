class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = t.length();

        for(int i=0 ; i<n ; i++){
            char ch = t.charAt(i);
            map.put(ch , map.getOrDefault(ch,0) + 1);
        }

        int unique = map.size();
        int si = -1;
        int windowStart = 0;
        int windowEnd = 0;
        int m = s.length();
        int minLen = Integer.MAX_VALUE;

        while(windowEnd < m){
            char ch1 = s.charAt(windowEnd);

                if(map.containsKey(ch1)){
                    map.put(ch1,map.get(ch1) - 1);
                    
                    if(map.get(ch1) == 0){
                        unique--;
                    }
                }

                while(unique == 0){
                    char ch2 = s.charAt(windowStart);

                    int len = windowEnd - windowStart + 1;

                    if(len < minLen){
                        minLen = len;
                        si = windowStart;
                    }

                    if(map.containsKey(ch2)){
                        map.put(ch2,map.get(ch2) + 1);

                        if(map.get(ch2) > 0){
                            unique++;
                        }
                    }

                    windowStart++;
                }

                windowEnd++;
            
        }

        if(si == -1){
            return "";
        }

        return s.substring(si , si + minLen);
    }
}