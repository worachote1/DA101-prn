import java.util.ArrayList;
import java.util.Scanner;

public class ch5_NumberFont {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss  =sc.nextLine();
		int[] count_NumChar = new int[10];
		int[] count_UpChar = new int[26];
		int[] count_LowChar = new int[26];
	
		for(int i=0;i<ss.length();i++) {
			char c = ss.charAt(i); 
			//upper char
			if((int)c>=65 && (int)c<=90 ){
				int index = ss.charAt(i)-'A';
				count_UpChar[index]++;
			}
			//lower char
			else if((int)c>=97 && (int)c<=122 ) {
				int index = ss.charAt(i)-'a';
				count_LowChar[index]++;
			}
			//num char
			else {
				int index = ss.charAt(i)-'0';
				count_NumChar[index]++;
			}
		}
		
		//display
		for(int i=0;i<count_NumChar.length;i++) {
			System.out.print(count_NumChar[i]+" ");
		}
		for(int i=0;i<count_UpChar.length;i++) {
			System.out.print(count_UpChar[i]+" ");
		}
		for(int i=0;i<count_LowChar.length;i++) {
			System.out.print(count_LowChar[i]);
			if(i!=count_LowChar.length-1)
				System.out.print(" ");
		}
	}

}
