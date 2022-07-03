package DST1_ArrayList;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel{
	
	MyArrayList_forGUI<Particle> list = new MyArrayList_forGUI<Particle>();
	
	public GUI() {
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					int n = (int)(Math.random()*50);
					for(int i=0;i<n;i++) {
						list.add(new Particle());
					}
					
					for(int i=0;i<list.getSize();i++) {
						list.get(i).move();
						System.out.println("prn size now = "+list.getSize());
					}
					
					//check death particle
					for(int i=0;i<list.getSize();i++) {
						if(!(list.get(i).getIsAlive())) {
							list.removeAt(i);
							i--;
						}
					}
					
					repaint();
				}
				
			}
		});
		t.start();
		
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0;i<list.getSize();i++) {
			list.get(i).draw(g);
		}
	}
	
	public static void main(String[] args) {
		new GUI();
	}
}
