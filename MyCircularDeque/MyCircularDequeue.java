class MyCircularDequeue{
 	int front,rear,capacity;
 	int[] queue;
 	public void MyCircularDequeue(int k){
 		queue = new int[k+1];
 		capacity = k+1;
 	}
 	public boolean insertFront(int value){
		if(isFull()){
			return false;
		}
		queue[front = ((front - 1 + capacity)%capacity)] = value;
		return true;
 	}
 	public boolean insertRear(int value){
 		if(isFull()){
 			return false;
 		}
 		queue[rear] = value;
 		rear = ((rear + 1 + capacity)%capacity);
 		return true;
 	}
 	public boolean deleteFront(){
 		if(isEmpty()){
 			return false;
 		}
 		front = (front+1+capacity)%capacity;
 	}
 	public boolean deleteRear(){
 		if(isEmpty()){
 			return false;
 		}
 		rear = (rear -1 + capacity)%capacity;
 	}
 	public int getFront(){
 		if(isEmpty()){
 			return -1;
 		}
 		return queue[front];
 	}
 	public int getRear(){
 		if(isEmpty()){
 			return -1;
 		}
 		return queue[rear];
 	}
 	public boolean isEmpty(){
 		return front == rear;
 	}
 	public boolean isFull(){
 		return (rear + 1)%capacity == front;
 	}
}
