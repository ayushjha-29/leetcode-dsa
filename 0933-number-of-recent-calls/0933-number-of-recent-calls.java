class RecentCounter {

    Deque<Integer> queue = new ArrayDeque<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        int counter = 1;

        while(!queue.isEmpty() && queue.peek() < t - 3000){
            queue.remove();
        }

        counter+=queue.size();

        queue.add(t);

        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */