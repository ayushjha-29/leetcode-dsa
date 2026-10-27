class Solution {
    public String predictPartyVictory(String senate) {
        Deque<Integer> radiant = new ArrayDeque<>();
        Deque<Integer> dire = new ArrayDeque<>();

        int n = senate.length();

        for(int i=0 ; i<n ; i++){
            if(senate.charAt(i) == 'R'){
                radiant.add(i);
            }else{
                dire.add(i);
            }
        }

        while(!radiant.isEmpty() && !dire.isEmpty()){
            if(radiant.peek() < dire.peek()){
                radiant.add(radiant.peek() + n);
                radiant.remove();
                dire.remove();
            }else{
                dire.add(dire.peek() + n);
                dire.remove();
                radiant.remove();
            }
        }

        if(radiant.isEmpty()){
            return "Dire";
        }

        return "Radiant";
    }
}