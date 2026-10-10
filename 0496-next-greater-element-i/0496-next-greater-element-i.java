class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> monotonicStack = new ArrayDeque<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        int l1 = nums1.length;
        int l2 = nums2.length;

        monotonicStack.push(nums2[0]);

        for(int i=1 ; i<l2 ; i++){
            int num = nums2[i];

            if(!monotonicStack.isEmpty()){

                while(!monotonicStack.isEmpty() && monotonicStack.peek() < num){
                    map.put(monotonicStack.peek(),num);
                    monotonicStack.pop();
                }   
            }

            monotonicStack.push(num);    
        }

        int [] result = new int[l1];

        for(int i=0 ; i<l1 ; i++){
            result[i] = map.getOrDefault(nums1[i],-1);
        }

        return result;
    }
}