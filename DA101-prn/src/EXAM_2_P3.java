import java.util.Scanner;

public class EXAM_2_P3 {

	public static void main(String[] args) {
		
		int row,col;
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		int k[][] = new int [row][col];
		int count_inhibitors = 0;
		for(int i=0;i<k.length;i++) 
		{
			for(int j=0;j<k[0].length;j++) {
				k[i][j] = sc.nextInt();
			}
		}
		
		//find better inhibitors
		for(int i=0;i<k.length;i++) 
		{
			for(int j=0;j<k[0].length;j++) {
				//Have left side element ?
				if(j>0) {
					if(!(k[i][j]>k[i][j-1])) {
						//System.out.println("break left at i = "+i+" j = "+j);
						continue;
					}
				}
				//have right side element?
				if(j<k[0].length-1) {
					if(!(k[i][j]>k[i][j+1])) {
						//System.out.println("break right at i = "+i+" j = "+j);
						continue;
					}
				}
				//have above element ?
				if(i>0) {
					//check top
					if(!(k[i][j]>k[i-1][j])) {
						continue;
					}
					//check top left diagonal
					if(j!=0) {
						if(!(k[i][j]>k[i-1][j-1])) {
							continue;
						}
					}
					//check top right diagonal
					if(j!=k[0].length-1) {
						if(!(k[i][j]>k[i-1][j+1])) {
							continue;
						}
					}
				}
				//have lower element
				if(i<k.length-1) {
					//check lower
					if(!(k[i][j]>k[i+1][j])) {
						continue;
					}
					//check lower left diagonal
					if(j!=0) {
						if(!(k[i][j]>k[i+1][j-1])) {
							continue;
						}
					}
					//check lower right diagonal
					if(j!=k[0].length-1) {
						if(!(k[i][j]>k[i+1][j+1])) {
							continue;
						}
					}
				}
				
				//if not be stop before this line
				//this is better inhibitor
				count_inhibitors++;
			}
		}
		
		System.out.println(count_inhibitors);
	}

}
