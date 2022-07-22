import java.util.Scanner;

public class EXAM_2_P12 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String com_name[] = new String[n];
		int m[] = new int[n];
        
		//data of each Max age person
		String idMax[] = new String[n];
		int ageMax[] = new int[n];
		String nameMax[] = new String[n];
		String surNameMax[] = new String[n];
		
		sc.nextLine();
		// get company name and number of officer
		for (int i = 0; i < n; i++) {
			String ss[] = sc.nextLine().split(" ");
			com_name[i] = ss[0];
			m[i] = Integer.parseInt(ss[1]);
		}
        
		//get input of each person 
		//then push some to maxAge person data
		for (int i = 0; i < n; i++) {
			int maxAge = Integer.MIN_VALUE;
			int maxAgeIndex = 0;
			
			int age[] = new int [m[i]];
			String id[] = new String[m[i]];
			String name[] = new String[m[i]];
			String surName[] = new String[m[i]];
			
			// input detail of each person
			for (int j = 0; j < m[i]; j++) {
				String ss[] = sc.nextLine().split(" ");	
				age[j] = Integer.parseInt(ss[3]);
				id[j] = ss[0];
				name[j] = ss[1];
				surName[j] = ss[2];
			}
			// find maxAge of each company
			for (int j = 0; j < m[i]; j++) {
				if (maxAge < age[j]) {
					maxAge = age[j];
					maxAgeIndex = j;
				}
			}
			//push to maxAge person data
			idMax[i] = id[maxAgeIndex];
			ageMax[i] = age[maxAgeIndex];
			nameMax[i] = name[maxAgeIndex];
			surNameMax[i] = surName[maxAgeIndex];

		}
		
		// sort company by alphabet
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if ((int) com_name[j].charAt(0) > (int) com_name[j + 1].charAt(0)) {
					// swap company name
					String temp_comName = com_name[j + 1];
					com_name[j + 1] = com_name[j];
					com_name[j] = temp_comName;
					// swap data of officer of each company
					String temp_idMax = idMax[j + 1]; idMax[j + 1] = idMax[j]; idMax[j] = temp_idMax;
					int temp_ageMax = ageMax[j+1]; ageMax[j + 1] = ageMax[j]; ageMax[j] = temp_ageMax;
					String temp_nameMax = nameMax[j+1]; nameMax[j + 1] = nameMax[j]; nameMax[j] = temp_nameMax;
					String temp_surNameMax = surNameMax[j+1]; surNameMax[j + 1] = surNameMax[j]; surNameMax[j] = temp_surNameMax;
				}
			}
		}

		// display all detail about most eldest person
		for(int i=0;i<n;i++) {
			System.out.println(com_name[i] + " " + idMax[i] + " " + ageMax[i] + " "
					+ nameMax[i] + " " + surNameMax[i]);	
		}

		sc.close();
	}
}
