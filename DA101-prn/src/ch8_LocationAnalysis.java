import java.util.ArrayList;
import java.util.Scanner;

public class ch8_LocationAnalysis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// input data section
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String[]> data = new ArrayList<String[]>();
		for (int i = 0; i < n; i++) {
			String ssAll[] = sc.nextLine().split(": ");
			String keyId = ssAll[0];
			String city[] = ssAll[1].split(", ");

			String ssData[] = new String[1 + (city.length)];
			ssData[0] = keyId;
			for (int j = 1; j < ssData.length; j++) {
				ssData[j] = city[j - 1];
			}

			data.add(ssData);
		}

		// end input section

		// set target section
		String targetID = sc.nextLine();
		ArrayList<String> targetCity = new ArrayList<String>();
		// get targetCity
		int tgIndex = 0;
		// find targetID
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i)[0].equals(targetID)) {
				tgIndex = i;
				//System.out.println("tgIndex = "+tgIndex);
				break;
			}
		}
		//add target city
		for(int i=1;i<data.get(tgIndex).length;i++) {
			targetCity.add(data.get(tgIndex)[i]);
		}

		//calculate section
		// add all id that have traveled the same city
		ArrayList<String> result = new ArrayList<String>();
		Boolean notFound = true;
		for(int i=0;i<data.size();i++) {
			if(data.get(i)[0].equals(targetID))
				continue;
			for(int j=1;j<data.get(i).length;j++) {
				String id = data.get(i)[0];
				String c = data.get(i)[j];
				if(result.contains(id))
					break;
				if(targetCity.contains(c)) {
					result.add(id);
					notFound= false;
					break;
				}
			}
		}
		
		
		// display all
//		for(int i=0;i<data.size();i++) {
//			System.out.println("KeyId = "+data.get(i)[0]);
//			for(int j=1;j<data.get(i).length;j++) {
//				System.out.print(data.get(i)[j]+" ");
//			}
//			System.out.println();
//		}
//		
//		//display target
//		System.out.println("targetID : "+targetID);
//		System.out.println("target city : ");
//		for(int i=0;i<targetCity.size();i++) {
//			System.out.print(targetCity.get(i)+" ");
//		}
		
		//display result
		if(notFound) {
			System.out.println("Not Found");
			return;
		}
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}

}
