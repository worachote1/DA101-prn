package DST4_Queue;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Maze_GUI extends JPanel{

	int maze[][] = new int[20][20];
	
	public void readFile() {
		try {
			Scanner sc = new Scanner(new File("maze.txt"));
			
			int i=0;
			while(sc.hasNext()) {
				String s  = sc.nextLine();
				for(int j=0;j<s.length();j++) {
					//Mark which positions are wall with -44
					if(s.charAt(j)=='x') {
						maze[i][j] = -44;
					}
				}
				i++;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Maze_GUI() {
		
		readFile();
		
		Maze_solver solver = new Maze_solver();
		solver.solve(maze);
		
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1100,700);
		f.setVisible(true);
		
	}

	
	public void paint(Graphics g) {
		
		super.paint(g);
		int size = 15;
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				if(maze[i][j]==-44) {
					//it's a wall
					g.setColor(Color.black);
					g.fillRect(j*size+40, i*size+40, size, size);
				}
				else if(maze[i][j]== 999) {
					//it's way tracking back to start 
					//after find shortest way to end
					g.setColor(Color.MAGENTA);
					g.fillRect(j*size+40, i*size+40, size, size);
				}
				else {
					//Not a wall
					g.setColor(Color.black);
					g.drawRect(j*size+40, i*size+40, size, size);
				}
			}
		}
 }
	
	public static void main(String[] args) {
		
		new Maze_GUI();
	}
}