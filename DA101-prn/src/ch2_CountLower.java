import java.util.Scanner;

public class ch2_CountLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i)))
				count++;
		}
		System.out.println(count);
	}

}
