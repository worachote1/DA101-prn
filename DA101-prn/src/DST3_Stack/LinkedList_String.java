package DST3_Stack;

public class LinkedList_String {
	Node_String head;
	int size;
	
	public LinkedList_String() {
		head = new Node_String();
	}
	
	public void addFirst(String s) {
		Node_String n = new Node_String();
		n.data = s;
		n.next = head.next;
		head.next = n;
		size++;
	}
	
	public void addLast(String s) {
		Node_String n = head;
		while(!(n.next==null)) {
			n = n.next;
		}
		n.next = new Node_String();
		n.next.data = s;
		size++;
	}
	
	public void insertAt(String s,int i) {
		Node_String n = head;
		int count = 0;
		while(!(n.next==null) && (count<i)) {
			n = n.next;
			count++;
		}
		Node_String temp = n.next;
		n.next = new Node_String();
		n.next.data = s;
		n.next.next =temp;
		size++;
	}
	
	public void removeAt(int i) {
		Node_String n = head;
		int count = 0;
		while(!(n.next==null) && (count<i)) {
			n = n.next;
			count++;
		}
		if(n.next == null) {
			return;
		}
		n.next = n.next.next;
		size--;
	}
	
	public String getData(int i) {
		int count = 0;
		Node_String n = head;
		for( ; (count<=i) && !(n==null) ; count++) {
			n = n.next;
		}
		if(n==null) return "";
		return n.data;
	}
	
	public int size() {
		return size;
	}
	
}
