import java.util.ArrayList;
import java.util.Scanner;

public class ch6_SearchDocument {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String[]> data = new ArrayList<String[]>();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			data.add(s.split(" "));
		}

		String choice_order;
		ArrayList<String> sub_order = new ArrayList<String>();
		String order = sc.nextLine();
		choice_order = order.split(" ")[0];
		String tempSub[] = order.split(" ");
		for (int i = 1; i < tempSub.length; i++) {
			sub_order.add(tempSub[i]);
		}
		// test display sub_order
//		for(int i=0;i<sub_order.size();i++) {
//			System.out.println(sub_order.get(i));
//		}
		ArrayList<String> result_data = new ArrayList<String>();
		int countToAnd = 0;
		// search for or
//		System.out.println("data size = "+data.size());
//		System.out.println("data file name(0)[0] "+data.get(0)[0]);
//		System.out.println("data file name(1)[0] "+data.get(1)[0]);
//		System.out.println("sub_order size "+sub_order.size());
		if (choice_order.equals("or")) {
			// System.out.println("prn or");
			for (int i = 0; i < data.size(); i++) {
				// System.out.println("data.get(i)[0] -> "+data.get(i)[0]);
				for (int j = 1; j < data.get(i).length; j++) {
					// System.out.println("prn j");
					// System.out.println("data.get(i)[j] -> "+data.get(i)[j]);
					if (sub_order.contains(data.get(i)[j])) {
						// System.out.println("prn found");
						result_data.add(data.get(i)[0]);
						break;
					}
				}
			}
		}
		// search for and
		else if (choice_order.equals("and")) {
			// System.out.println("prn and");
			for (int i = 0; i < data.size(); i++) {
				// if that document not have the same sub as sub_order
				// skip this round
				if (data.get(i).length - 1 < sub_order.size())
					continue;

				int countToAll = 0;
				for (int j = 1; j < data.get(i).length; j++) {
					if (sub_order.contains(data.get(i)[j])) {

						countToAll++;
					}
				}
				if (countToAll == sub_order.size())
					result_data.add(data.get(i)[0]);
			}
		}

		// display result
		if (result_data.size() == 0) {
			System.out.println("[]");
			return;
		}

		// sort alphabet
		int size = result_data.size();
		for (int i = 0; i < size - 1; i++) {
			
			for (int j = 0; j < size - 1 - i; j++) {
				for (int k = 0; k < result_data.get(j).length(); k++) {
					if (result_data.get(j).charAt(k) < result_data.get(j + 1).charAt(k)) {
						break;
					}
					if (result_data.get(j).charAt(k) == result_data.get(j + 1).charAt(k)) {
						continue;
					}
					if (result_data.get(j).charAt(k) > result_data.get(j + 1).charAt(k)) {
						String temp = result_data.get(j);
						result_data.set(j, result_data.get(j + 1));
						result_data.set(j + 1, temp);
						// count++;
						break;
					}
				}
			}
		}
		// final display
		System.out.print("[");
		for (int i = 0; i < result_data.size(); i++) {
			System.out.print("'" + result_data.get(i) + "'");
			if (i != result_data.size() - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}

}
