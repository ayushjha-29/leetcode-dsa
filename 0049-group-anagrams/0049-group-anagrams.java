class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        HashMap<String,List<String>> map = new HashMap<>();

        for(String word : strs){
            int [] frequency = new int[26];

            for(char c : word.toCharArray()){
                frequency[c - 'a'] += 1;
            }

            String key = Arrays.toString(frequency);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }

        for(List<String> list : map.values()){
            result.add(list);
        }

        return result;
    }
}