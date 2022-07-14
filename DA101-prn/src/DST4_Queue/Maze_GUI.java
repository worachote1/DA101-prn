package DST4_Queue;

import java.awt.Button;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import DST1_ArrayList.GUI;

public class Maze_GUI extends JPanel{

	public MyQueue<Integer> q;
	
	public Maze_GUI() {
		
		q=new MyQueue<Integer>();
		
		q.enqueue(44);
		q.enqueue(3);
		q.enqueue(16);
		q.enqueue(29);
		
		//q.dequeue();
		
		System.out.println(q.dequeue());
		
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
		
	}

	
	public void paint(Graphics g) {
		
		super.paint(g);
		q.draw(g);
 }
	
	public static void main(String[] args) {
		
		new Maze_GUI();
	}
}