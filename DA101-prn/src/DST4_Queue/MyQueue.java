package DST4_Queue;

import java.awt.Graphics;

public class MyQueue<T> {
	DoublyLinkedList<T> list;
	
	public MyQueue() {
		
		list = new DoublyLinkedList<>();
	}
	
	public void enqueue(T x) {
		list.addFirst(x);
	}
	
	public T dequeue() {
		T t=list.get(list.size-1);
		list.removeAt(list.size-1);
		return t;
	}
	
	public T peek() {
		T t=list.get(list.size-1);
		return t;
	}
	
	public int size() {
		return list.size;
	}
	
	public void draw(Graphics g) {
		for(int i=0;i<list.size;i++) {
			g.drawRect(50+40*i, 300, 40, 40);
			g.drawString(""+ list.get(i),50+40*i+20,300+20 );
		}
	}
}
