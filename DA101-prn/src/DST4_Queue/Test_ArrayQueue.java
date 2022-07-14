package DST4_Queue;

public class Test_ArrayQueue {

	public static void main(String[] args) {
		
		ArrayQueue a = new ArrayQueue();
		for(int i=0;i<10;i++) {
			a.enqueue((int)(Math.random()*100));
		}
		
		a.printQueue();
	}

}
