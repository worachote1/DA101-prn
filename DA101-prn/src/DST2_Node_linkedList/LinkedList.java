package DST2_Node_linkedList;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class LinkedList {

	Node head;

	public LinkedList() {
		head = new Node();
		System.out.println("head start "+"prn = "+head.data);
		// head.next = null by default
	}

	public void addFirst(int x) {
		Node n = new Node();
		n.data = x;

		n.next = head.next;
		//head.next = n;
		
		System.out.println("addFirst prn = "+n.data);
	}

	public void addLast(int x) {
		Node n = head;
		while (!(n.next == null)) {
			n = n.next;
		}
		n.next = new Node();
		n.next.data = x;
		
		//System.out.println("addLast prn = "+n.data);
	}

	public void insert(int x,int i) {
		int  count = 0;
		Node n = head;
		while(!(n.next == null) && count<i) {
			n = n.next;
			count++;
		}
		//test insert node
		Node temp = n.next;
		n.next = new Node();
		n.next.data = x;
		n.next.next = temp;
		
	}
	
	public void removeAt(int i) {
		int count = 0;
		Node n = head;
		while(!(n==null)) {
			
		}
	}
	
	public void draw(Graphics g) {
		int i =0;
		Node n = head;
		Font fn = new Font("Serif", Font.BOLD, 20);
	
		while(!(n==null)){
			//Draw Oval
			//i++;
			g.setColor(Color.BLACK);
			g.fillOval(50+60*i, 50, 50+1, 50+1); //Border black
			g.setColor(Color.YELLOW);
			g.fillOval(50+60*i, 50, 50, 50); //Oval yellow
			
			//Draw Data
			g.setColor(Color.BLACK);
			g.setFont(fn);
			g.drawString(""+n.data, 40+60*i+25,80);
			
			//Draw straight line that divide node into data and next
			g.drawLine( 40+60*i+50, 55, 40+60*i+50, 95);
		
			//Draw arrow line
			g.drawLine(40+60*i+50, 75, 50+60*(i+1), 75);
			g.drawLine(50+60*(i+1), 75, 50+60*(i+1)-5, 65);
			g.drawLine(50+60*(i+1), 75, 50+60*(i+1)-5, 85);
			
			i++;
			n=n.next;
		}
	}
	
	//test
	//print node data
	public void show() {
		Node node = head;
		while(!(node.next==null)) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
