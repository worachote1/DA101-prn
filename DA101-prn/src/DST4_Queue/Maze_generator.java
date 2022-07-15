package DST4_Queue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Maze_generator {
	
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new File("maze.txt"));
			
			for(int i=0;i<20;i++) {
				for(int j=0;j<20;j++) {
					if(Math.random() < 0.27) {
						pw.print("x");
					}
					else {
						pw.print(" ");
					}
				}
				pw.println();
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
