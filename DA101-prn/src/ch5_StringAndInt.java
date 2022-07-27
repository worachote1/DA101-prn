import java.util.Scanner;

public class ch5_StringAndInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
	
		String a = ss.split(" ")[0];
		String b = ss.split(" ")[1];
		
		//System.out.println("a = "+a+" b = "+b);
		
		//display 1
		for(int i=0;i<a.length();i++) {
			char c = (i==0) ? Character.toUpperCase(a.charAt(i)) : Character.toLowerCase(a.charAt(i));
			System.out.print(c);
		}
		System.out.print(" ");
		
		//display 2
		int sum = 0;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)-'0'>=0 && b.charAt(i)-'0'<=9) {
				//System.out.println("char prn = "+b.charAt(i));
				sum += b.charAt(i)-'0';
			}
		}
		System.out.print(sum);
	}
	// helloWOrld 12g34
}
