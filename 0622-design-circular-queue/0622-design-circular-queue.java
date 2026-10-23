class MyCircularQueue {

    int [] queue;
    int count = 0;
    int front = 0 , rear = -1;

    public MyCircularQueue(int k) {
        queue = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        count++;

        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        front = (front + 1) % queue.length;
        count--;

        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }

        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }

        return queue[rear];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == queue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */