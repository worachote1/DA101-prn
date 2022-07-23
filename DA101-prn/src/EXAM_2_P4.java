import java.util.ArrayList;
import java.util.Scanner;

public class EXAM_2_P4 {

	public static void displayVolume(int volume[][]) {
		// display input for water volume of each province
		for (int i = 0; i < volume.length; i++) {
			for (int j = 0; j < volume[0].length; j++) {
				System.out.print(volume[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-");
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

		Boolean endFlood_check = false;
		int countRow_flood = 0;
		int flood_bankokCount = 0;

		Boolean flood_bottom[] = new Boolean[volume[0].length];
		Boolean flood_left[] = new Boolean[volume[0].length];
		Boolean flood_right[] = new Boolean[volume[0].length];
		Boolean flood_top[] = new Boolean[volume[0].length];

		// ArrayList to keep each flood result
		ArrayList<int[][]> flood_result = new ArrayList<int[][]>();

		while (!endFlood_check) {
			countRow_flood = 0;
			for (int i = 0; i < volume.length; i++) {
				for (int j = 0; j < volume[0].length; j++) {
					flood_bottom[j] = false;
					flood_left[j] = false;
					flood_right[j] = false;
					flood_top[j] = false;
					// check if flood bottom ?
					if (i < volume.length - 1) {
						int a = volume[i][j] + altitude[i][j];
						int a_bottom = volume[i + 1][j] + altitude[i + 1][j];
						if (volume[i][j] > 0 && a - a_bottom >= 2) {
							flood_bottom[j] = true;
							volume[i][j]--;
						}
					}
					// check if flood left ?
					if (j > 0) {
						int a = volume[i][j] + altitude[i][j];
						int a_left = volume[i][j - 1] + altitude[i][j - 1];
						if (volume[i][j] > 0 && a - a_left >= 2) {
							flood_left[j] = true;
							volume[i][j]--;
						}
					}
					// check if flood right ?
					if (j < volume[0].length - 1) {
						int a = volume[i][j] + altitude[i][j];
						int a_right = volume[i][j + 1] + altitude[i][j + 1];
						if (volume[i][j] > 0 && a - a_right >= 2) {
							flood_right[j] = true;
							volume[i][j]--;
						}
					}
					// check if flood top ?
					if (i > 0) {
						int a = volume[i][j] + altitude[i][j];
						int a_top = volume[i - 1][j] + altitude[i - 1][j];
						if (volume[i][j] > 0 && a - a_top >= 2) {
							flood_top[j] = true;
							volume[i][j]--;
						}
					}
				}

				// set new flood metric before go to another row
				for (int j = 0; j < volume[0].length; j++) {
					if (flood_bottom[j]) {
						volume[i + 1][j]++;
					}
					if (flood_left[j]) {
						volume[i][j - 1]++;
					}
					if (flood_right[j]) {
						volume[i][j + 1]++;
					}
					if (flood_top[j]) {
						volume[i - 1][j]++;
					}

					// check if not flood in any direction
					if (!flood_bottom[j] && !flood_left[j] && !flood_right[j] && !flood_top[j]) {
						countRow_flood++;

						// end loop because can't flood anymore
						if (countRow_flood == row * col) {
							flood_bankokCount = volume[bankok_posX][bankok_posY];
							endFlood_check = true;
						}
						// System.out.println("countRow = "+countRow_flood+" at i = "+i+" j = "+j);
					}
				}
			}
			// add each flood to arrayList
			int VolumeClone[][] = new int[row][col];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					VolumeClone[i][j] = volume[i][j];
				}
			}
			flood_result.add(VolumeClone);
		}

		// display result as grader want
		System.out.println(flood_bankokCount);
		//else System.out.println(flood_bankokCount);
		for (int i = 0; i < flood_result.size(); i++) {
			displayVolume(flood_result.get(i));
		}
		sc.close();
	}
}