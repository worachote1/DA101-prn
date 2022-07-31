import java.util.Scanner;

public class ch9_Picture {

	public static double[][] scale(int img[][],int c) {
		
		double out[][] = new double[img.length/c][img[0].length/c];
		
		//get value to out[][]
		for(int i=0;i<out.length;i++) {
			for(int j=0;j<out[0].length;j++) {
				
				//cal
				double avg,sum=0;
				int count = 0;
				for(int k=c*i;k<=c*(i+1)-1;k++) {
					for(int l=c*j;l<=c*(j+1)-1;l++) {
						sum += img[k][l];
						count++;
					}
				}
				//System.out.println("sum prn = "+sum+" count ="+count);
				avg = sum/count;
				out[i][j] = avg;
			}
		}
		
		return out;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row,col;
		row = sc.nextInt();
		col = sc.nextInt();
		int img[][] = new int [row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				img[i][j] = sc.nextInt();
			}
		}
		
		int c = sc.nextInt();
		double out[][] = scale(img, c);
	
		//display result
		for(int i=0;i<out.length;i++) {
			for(int j=0;j<out[0].length;j++) {
				System.out.format("%.2f",out[i][j]);
				if(j!=out[0].length-1)
					System.out.print(" ");
			}
			System.out.println();
		}
		
		/*
		4 6
		1 2 2 3 3 2
		2 1 2 3 2 3
		2 3 2 2 4 2
		3 2 2 2 2 4
		2
		*/
	}

}
