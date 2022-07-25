import java.util.Scanner;

public class ch2_Digit {

	public static void main(String[] args) {
		
		int countDigit[] = new int[10];
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		//count each digit
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<10;j++) {
				if(Integer.parseInt(String.valueOf(s.charAt(i)))==j) {
					countDigit[j]++;
					break;
				}
			}
		}
		//display
		for(int i=0;i<countDigit.length;i++) {
			System.out.println(countDigit[i]);
		}

	}

}
