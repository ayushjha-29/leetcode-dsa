class MyStack {

    Deque<Integer> queue1 = new ArrayDeque<>();
    Deque<Integer> queue2 = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        queue2.add(x);

        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }

        Deque<Integer> temp = queue2;
        queue2 = queue1;
        queue1 = temp;

    }
    
    public int pop() {
        return queue1.remove();
    }
    
    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */