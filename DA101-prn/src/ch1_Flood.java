import java.util.Scanner;

public class ch1_Flood {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ss[] = sc.nextLine().split(", ");
		int allArea[] = new int[ss.length];
		sc.close();
		for (int i = 0; i < ss.length; i++) {
			allArea[i] = Integer.parseInt(ss[i]);
		}
		// 0, 1, -2, -3, 2, 3, -1, 0
		// 1, -3, -2, -1, -1, 2, 2, 3, -3, 2, 0, 1, 0, 1, 3, -3
		int i = 1; // start at index 1
		int floodArea = 0;
		// Boolean isFirstNegative = false;
		if (allArea.length == 1) {
			if (allArea[i] <= 0) {
				floodArea++;
			}
			System.out.println(floodArea);
			return;
		} 
		else {
			while (i != allArea.length - 1) {
				// now not first index

				if (allArea[i] >= 0) {
					if (allArea[i - 1] < 0) {
						floodArea++;
						//System.out.println("flood++ at i = "+i);
					}
					//i++;
				}
				i++;
			}
		}
		//check last index
		int lastIndex = allArea.length - 1;
		if(allArea[lastIndex] >= 0) {
			if(allArea[lastIndex-1]<0) {
				floodArea++;
				//System.out.println("flood++ end at i = "+lastIndex);
			}
		}
		else if(allArea[lastIndex]<0) {
			floodArea++;
			//System.out.println("flood++ end at i = "+lastIndex);
		}
		System.out.print(floodArea);
	}

}
