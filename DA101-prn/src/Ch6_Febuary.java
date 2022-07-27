import java.util.Scanner;

public class Ch6_Febuary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int be = sc.nextInt();
		int ad = be-543;

		int febDay=0;
		if(ad%4==0) {
			if(ad%100==0) {
				if(ad%400==0)
					febDay=29;
				else
					febDay=28;
			}
			else 
				febDay=29;
		}
		else 
			febDay = 28;
		System.out.println("Day="+febDay);
	}

}
