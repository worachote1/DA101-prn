package DST4_Queue;

import java.util.Arrays;

public class ArrayQueue {
	int data[];
	int head;
	int tail;
	int size;
	
	public ArrayQueue() {
		data = new int[10];
		head = 0;
		tail = -1;
		size=0;
	}
	
	public void enqueue(int x) {
		if(size==data.length) {
			return;
		}
		tail = (tail+1)%data.length;
		data[tail] = x;
		size++;
	}
	
	public int dequeue() {
		if(size==0) {
			return -9999;
		}
		int temp = data[head];
		head = (head+1)%data.length;
		size--;
		return temp;
	}
	
	public void printQueue() {
		System.out.println(Arrays.toString(data));
	}
	
}
