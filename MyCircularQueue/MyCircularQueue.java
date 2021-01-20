class MyCircularQueue {
    int front=-1;
    int rear = -1;
    int[] queue;
    public MyCircularQueue(int k) {
        queue = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            if(front == -1){
                front++;
            }
            if(rear == queue.length -1){
                rear = 0;
            }else{
                rear++;
            }
            queue[rear]  = value;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            if(front == rear){
                front = rear = -1;
            }else if(front == queue.length -1){
                front = 0;
            }else{
                front++;
            }
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(front == -1){
            return -1;
        }else 
            return queue[front];
    }
    
    public int Rear() {
        if(rear == -1){
            return -1;
        }else
            return queue[rear];
    }
    
    public boolean isEmpty() {
        return front==-1 && rear == -1;
    }
    
    public boolean isFull() {
        return (front == 0 && rear == queue.length-1) || (front == rear +1);
    }
}
