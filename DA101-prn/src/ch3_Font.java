import java.util.Scanner;

public class ch3_Font {

	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		// make each char of 2 strings not to be duplicated
		String s1_NotDup = "";
		String s2_NotDup = "";

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isWhitespace(s1.charAt(i))) {
				continue;
			}
			if (!(s1_NotDup.contains(s1.charAt(i) + ""))) {
				s1_NotDup += s1.charAt(i);
			}
		}
		
		for (int i = 0; i < s2.length(); i++) {
			if (Character.isWhitespace(s2.charAt(i))) {
				continue;
			}
			if (!(s2_NotDup.contains(s2.charAt(i) + ""))) {
				s2_NotDup += s2.charAt(i);
			}
		}
		
		// test display after not duplicated
//		System.out.println(s1_NotDup);
//		System.out.println(s2_NotDup);
//		System.out.println();

		// now check which char of 2 string is the same
		int count = 0;
		char temp_result[] = new char[200];
		int index_tempResult = 0;
		for (int i = 0; i < s1_NotDup.length(); i++) {
			for (int j = 0; j < s2_NotDup.length(); j++) {
				if (s1_NotDup.charAt(i) == s2_NotDup.charAt(j)) {
					count++;
					temp_result[index_tempResult++] = s1_NotDup.charAt(i);
					break;
				}
			}
		}

		// if these two string not have duplicated char
		if (count == 0) {
			System.out.println("NONE");
			return;
		}

		//Clone into upperCase array and lowerCase array
		char temp_Upper_result[] = new char[index_tempResult];
		int index_UpperCase = 0;
		char temp_Lower_result[] = new char[index_tempResult];
		int index_LowerCase = 0;
		for (int i = 0; i < index_tempResult; i++) {
			if(Character.isUpperCase(temp_result[i]))
				temp_Upper_result[index_UpperCase++]=temp_result[i];
			else
				temp_Lower_result[index_LowerCase++]=temp_result[i];
		}
		
		//sort alphabet
		//sort lower array
		for(int i=0;i<index_LowerCase-1;i++) {
			for(int j=0;j<(index_LowerCase-1)-i;j++) {
				if(temp_Lower_result[j]>temp_Lower_result[j+1]) {
					char temp = temp_Lower_result[j];
					temp_Lower_result[j] = temp_Lower_result[j+1];
					temp_Lower_result[j+1]=temp;
				}
			}
		}
		//sort upper
		for(int i=0;i<index_UpperCase-1;i++) {
			for(int j=0;j<(index_UpperCase-1)-i;j++) {
				if(temp_Upper_result[j]>temp_Upper_result[j+1]) {
					char temp = temp_Upper_result[j];
					temp_Upper_result[j] = temp_Upper_result[j+1];
					temp_Upper_result[j+1]=temp;
				}
			}
		}
		
		//After sort 
		//display final result
		String end = "";
		for(int i=0;i<index_LowerCase;i++) {
			//System.out.print(temp_Lower_result[i]+" ");
			end += temp_Lower_result[i]+" ";
		}
		for(int i=0;i<index_UpperCase;i++) {
			//System.out.print(temp_Upper_result[i]+" ");
			end += temp_Upper_result[i]+" ";
		}
		
		System.out.println(end);
	}

}
