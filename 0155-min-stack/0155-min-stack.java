class MinStack {

    public Deque<Integer> stack;

    public Deque<Integer> minStack = new ArrayDeque<>();

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        stack.addLast(value);

        if(minStack.isEmpty()){
            minStack.addLast(value);
        }else{
            if(minStack.peekLast() > value){
                minStack.addLast(value);
            }else{
                minStack.addLast(minStack.peekLast());
            }
        }
    }
    
    public void pop() {
        stack.removeLast();
        minStack.removeLast();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        return minStack.peekLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */