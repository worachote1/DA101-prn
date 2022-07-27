import java.util.Scanner;

public class ch4_EvenParityGen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();

		int count_BitOne = 0;
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)=='1') {
				count_BitOne++;
			}
		}
		if(count_BitOne%2==0)
			System.out.println(ss+'0');
		else
			System.out.println(ss+'1');
	}

}
