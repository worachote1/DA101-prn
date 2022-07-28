import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.Subject;

public class ch8_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int n = sc.nextInt();
		sc.nextLine();
		int subID = 4;
		int row = n;
		int col = subID + 1;
		String data[][] = new String[row][col];
		for (int i = 0; i < row; i++) {
			s = sc.nextLine();
			String ss[] = s.split(", ");
			// student ID
			data[i][0] = ss[0];
			// subject
			for (int j = 1; j < col; j++) {
				data[i][j] = ss[j];
			}
		}
		String subFind[];
		String sLast = sc.nextLine();
		String ssLast[] = sLast.split(", ");
		subFind = new String[ssLast.length];
		for (int i = 0; i < subFind.length; i++) {
			subFind[i] = ssLast[i];
		}

		// display find
//		System.out.println("Display findSub");
//		for(int i=0;i<subFind.length;i++) {
//			System.out.print(subFind[i]+" ");
//		}
		// System.out.println();
		// display result

		for (int k = 0; k < subFind.length; k++) {
			ArrayList<String> subSave = new ArrayList<String>();
			System.out.print(subFind[k] + " -> ");
			Boolean notFound = true;
			for (int i = 0; i < row; i++) {
				String studentID = data[i][0];
				for (int j = 1; j < col; j++) {
					if (data[i][j].equals(subFind[k])) {
						subSave.add(studentID);
						notFound = false;
						break;
					}
				}
			}
			if (notFound) {
				subSave.add("Not found");
				// continue;
			}
			// else {
			for (int i = 0; i < subSave.size(); i++) {
				System.out.print(subSave.get(i));
				if (i != subSave.size() - 1)
					System.out.print(", ");
			}
			// }
			System.out.println();
		}

		// test display all
//		System.out.println("test display data");
//		for (int i = 0; i < row; i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(data[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("test display subAllName");
//		for (int i = 0; i < subFind.length; i++) {
//			System.out.print(subFind[i] + " ");
//		}

	}

}
