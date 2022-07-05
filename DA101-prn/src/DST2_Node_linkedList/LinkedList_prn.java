package DST2_Node_linkedList;

public class LinkedList_prn {

	Node head;

//	public LinkedList_prn() {
//		head = new Node();
//	
//	}

	public void addFirst(int x) {

		Node node = new Node();
		node.data = x;
		node.next = null;
		// EPT
		// n.next = head.next;
		// head.next = n;

		// check if it's first node let it be head node
		if (head == null) {
			System.out.println("head null ");
			head = node;
		}
		// if not first node ,
		else {
			// then find the last node
			Node node_temp = head;
			while (!(node_temp.next == null)) {
				node_temp = node_temp.next;
			}
			// after find last node
			// then add the node that wanted to be add
			node_temp.next = node;
		}
	}

	// print node data
	public void show() {
		Node node = head;
		while (!(node.next == null)) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
