package DST4_Queue;

import java.security.InvalidParameterException;

public class DoublyLinkedList<T> {
	public int size;
	public Node<T> head,tail;
	
	public DoublyLinkedList() {
		head = new Node<T>();
		tail = new Node<T>();
		head.next = tail;
		tail.prev = head;
		size = 0;
	}
	
	public void insert(T x,int i) {
		int count = 0;
		Node<T> n;
		
		if(i>size) {
			System.out.println("Error prn");
			return;
		}
		
		//input i may be close to tail
		if(i>size/2) {
			n=tail;
			count = size;
			//shift to the node which is before node that will be inserted
			//shift backwards from tail
			for( ; count>(i-1);count--) {
				n = n.prev;
			}
		}
		//shift to the node which is before node that will be inserted
		else {
			n = head;
			count = 0;
			for(;count<i;count++) {
				n = n.next;
			}
		}
		
		//After shift process
		Node<T> temp = n.next;
		n.next = new Node<T>();
		n.next.data = x;
		n.next.next = temp;
		n.next.prev = n;
		temp.prev = n.next ;
		
	}
	
	public void addFirst(T x) {
		Node<T> n = new Node<T>();
		n.data = x;
		n.next = head.next;
		n.next.prev = n;
		n.prev = head;
		head.next = n;
		
		size++;
	}
	
	public void addLast(T x) {
		Node<T> n = new Node<T>();
		n.data = x;
		
		n.prev = tail.prev;
		n.prev.next = n;
		n.next = tail;
		tail.prev = n;
				
		size++;
	}
	
	public void removeAt(int i) {
		
		if(i < 0 || i>=size) {
			System.out.println("Error prn");
			return;
		}
		int count = 0;
		Node<T> n = head;
		
		while(n.next != tail && count<i) {
			n = n.next;
			count++;
		}
		
		n.next = n.next.next; 
		n.next.prev = n;
	
		size--;
	}
	
	public T get(int index) {
		if(index<0 || index>=size) {
			throw new InvalidParameterException("prn index out of range : "+index);
		}
		int count = 0;
		Node<T> p = head;
		while(!(p.next == null) && count<=index) {
			p = p.next;
			count++;
		}
		
		return (T)p.data;
	}
	
	public int size() {
		return size;
	}
	
}
