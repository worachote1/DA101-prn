package DST2_Node_linkedList;

public class DoublyLinkedList {
	public int size;
	public Node head,tail;
	
	public DoublyLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
		size = 0;
	}
	
	public void insert(int x,int i) {
		int count = 0;
		Node n;
		
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
		Node temp = n.next;
		n.next = new Node();
		n.next.data = x;
		n.next.next = temp;
		n.next.prev = n;
		temp.prev = n.next ;
	}
}
