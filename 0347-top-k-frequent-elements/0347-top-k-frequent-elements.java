class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num) + 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int n = nums.length;

        List<List<Integer>> bucket = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            bucket.add(i,new ArrayList<>());
        }

        int [] result = new int[k];

        for(int num : set){
            bucket.get(map.get(num)-1).add(num);
        }

        int idx = 0;

        for(int i = n-1; i >= 0 && idx < k ; i--){
            for(int num : bucket.get(i)){
                result[idx++] = num;

                if(idx == k){
                    break;
                }
            }
        }

        return result;
    }
}