import java.util.ArrayList;
import java.util.Scanner;

public class ch4_ConsonantAndVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		int vowelCount = 0;
		int consCount = 0;
		
		ArrayList<Character> vowel = new ArrayList<Character>(); 
		vowel.add('a');  vowel.add('A');
		vowel.add('e');  vowel.add('E');
		vowel.add('i');  vowel.add('I');
		vowel.add('o');  vowel.add('O');
		vowel.add('u');  vowel.add('U');
		
		for(int i=0;i<ss.length();i++) {
			char c = ss.charAt(i);
			if(vowel.contains(c)) {
				vowelCount++;
			}
			else {
				if((c>'A'&&c<='Z') || (c>'a' && c<='z')) {
					consCount++;
				}
			}
		}
		System.out.println(vowelCount+" "+consCount);
	}
	
}
