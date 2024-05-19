
class Queue{
	private final int SIZE;
	private int front;
	private int rear; 
	private int arr[];
	public Queue(int size) {
		SIZE = size;
		arr=new int[SIZE];
		front=0;
		rear=0;
	}
	public void push(int value) {
		System.out.println((isFull()));
		if(isFull()) {
			System.out.println("Queue is Full !!!");
		}
		else {
		arr[rear]=value;
		rear++;
		}
		}
	public void pop() {
		front++;
		
	}
	public int peek() {
		return arr[front];
	}
	public boolean isFull() {
		return (front==0 && rear==SIZE-1)||(front==SIZE-1 && rear==SIZE-1);
	}
	pubic boolean isEmpty(){
		return (front==0 && rear== 0);
	}
	
}





public class QuestionNo4 {

	
	
	public static void main(String[] args) {
		// Write program to implement linear queue in which front and rear starts at 0
		Queue que=new Queue(5);
		que.push(10);
		que.push(20);
		que.push(8);
		que.push(30);
		que.push(80);
		que.push(70);
		//System.out.println(que.peek());
		que.pop();
		//System.out.println(que.peek());
		que.pop();
		//System.out.println(que.peek());

	}

}
