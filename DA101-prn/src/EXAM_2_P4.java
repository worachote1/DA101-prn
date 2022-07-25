import java.util.ArrayList;
import java.util.Scanner;

public class EXAM_2_P4 {

	public static void displayVolume(int volume[][]) {
		// display input for water volume of each province
		int i=0;
		for (i = 0; i < volume.length; i++) {
			for (int j = 0; j < volume[0].length; j++) {
				System.out.print(volume[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// solve problem to find that
		// Bankok will be flooded or not ?
		int volume[][];
		int altitude[][];
		int row, col;
		int bankok_posX, bankok_posY;
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		bankok_posX = sc.nextInt();
		bankok_posY = sc.nextInt();
		bankok_posX -= 1; // to work in metric
		bankok_posY -= 1;
       
		altitude = new int[row][col];
		volume = new int[row][col];

		// get input for altitude of each province
		for (int i = 0; i < altitude.length; i++) {
			for (int j = 0; j < altitude[0].length; j++) {
				altitude[i][j] = sc.nextInt();
			}
		}

		// get input for water volume of each province
		for (int i = 0; i < volume.length; i++) {
			for (int j = 0; j < volume[0].length; j++) {
				volume[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		int countRow_flood = 0;
		int flood_bankokCount = 0;

		// ArrayList to keep each flood result
		ArrayList<int[][]> flood_result = new ArrayList<int[][]>();

		while (true) {
			countRow_flood = 0;
			// clone to temp_volume
			int temp_volume[][] = new int[row][col];
			for (int i = 0; i < volume.length; i++) {
				for (int j = 0; j < volume[0].length; j++) {
					temp_volume[i][j] = volume[i][j];
				}
			}
			// prn
			for (int i = 0; i < volume.length; i++) {
				for (int j = 0; j < volume[0].length; j++) {
					
					int t = temp_volume[i][j];
					Boolean flood_bottom = false;
					Boolean flood_left = false;
					Boolean flood_right = false;
					Boolean flood_top = false;
					// check if flood bottom ?
					if (i < volume.length - 1) {
						int a = t + altitude[i][j];
						int a_bottom = temp_volume[i + 1][j] + altitude[i + 1][j];
						if (t>0 && a - a_bottom >= 2) {
							volume[i][j]--;
							volume[i + 1][j]++;
							t--;
							flood_bottom = true;
						}
					}

					// check if flood left ?
					if (j > 0) {
						int a = t + altitude[i][j];
						int a_left = temp_volume[i][j-1] + altitude[i][j - 1];
						if (t>0 && a - a_left >= 2) {
							volume[i][j]--;
							volume[i][j - 1]++;
							t--;
							flood_left = true;
						}
					}
					// check if flood right ?
					if (j < volume[0].length - 1) {
						int a = t + altitude[i][j];
						int a_right = temp_volume[i][j+1] + altitude[i][j + 1];
						if (t>0 && a - a_right >= 2) {
							volume[i][j]--;
							volume[i][j + 1]++;
							t--;
							flood_right = true;
						}
					}
					// check if flood top ?
					if (i > 0) {
						int a = t + altitude[i][j];
						int a_top = temp_volume[i - 1][j] + altitude[i - 1][j];
						if (t>0 && a - a_top >= 2) {
							volume[i][j]--;
							volume[i - 1][j]++;
							t--;
							flood_top = true;
						}
					}
					
					if((!flood_bottom) && (!flood_left) 
							&& (!flood_right) && (!flood_top)) {
						countRow_flood++;
					}
				}
			}
			
			if (countRow_flood == row * col) {// row * col
				flood_bankokCount = volume[bankok_posX][bankok_posY];
				break;
			}
			
			// add each flood to arrayList
			
			int VolumeClone[][] = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					VolumeClone[i][j] = volume[i][j];
				} 
			}
			flood_result.add(VolumeClone);
			
			//System.out.println("prn hi countRow_flood = "+countRow_flood);
		}

		// display result as grader want
		System.out.println(flood_bankokCount);
		// else System.out.println(flood_bankokCount);
		for (int i = 0; i < flood_result.size(); i++) {
			//
			displayVolume(flood_result.get(i));
			//if(i!= flood_result.size()-1) {
				System.out.print("-");
				System.out.println();
			//}
		}
	}
}
