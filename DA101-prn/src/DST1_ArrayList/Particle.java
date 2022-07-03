package DST1_ArrayList;

import java.awt.Color;
import java.awt.Graphics;

public class Particle {

	private double x, y;
	private double vx, vy;
	private double ax, ay;
	
	private Color color;
	private int age;
	private boolean isAlive;
	
	public Particle() {
		x = 250;
		y = 250;
		vx = (int) (Math.random() * 10-5);
		vy = (int) (Math.random() * 10-5);
		ax = 0;
		ay = 0.5;
		color = new Color((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255));
		age = 1;
		isAlive = true;
	}
	
	public void move() {
		age++;
		if(age > 200) {
			isAlive = false;
		}
		x+=vx;
		y+=vy;
		
		vx+=ax;
		vy+=ay;
	}
	
	public Boolean getIsAlive() {
		return isAlive;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int)x,(int)y, 10, 10);
	}
	

}
