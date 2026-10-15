class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        stack.push(s.charAt(0));

        for(int i=1 ; i<s.length() ; i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return new String(result.reverse());
    }
}