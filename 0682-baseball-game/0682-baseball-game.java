class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i<operations.length ; i++){

            switch(operations[i]){
                case "+" : list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                break;
                case "D" : list.add(list.get(list.size() - 1) * 2);
                break;
                case "C" : list.remove(list.size()-1);
                break;
                default : list.add(Integer.parseInt(operations[i]));
            }
            
        }

        int result = 0;

        for(int i : list){
            result+=i;
        }
        
        return result;
    }
}