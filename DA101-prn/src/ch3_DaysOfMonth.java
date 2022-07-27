import java.util.Scanner;

public class ch3_DaysOfMonth {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int m,be,ad;
		m=sc.nextInt();
		be=sc.nextInt();
		ad=be-543;
		
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
		
		//
		if(m==2)
			System.out.println("Day="+febDay);
		else{
			if((m%2!=0 && (m!=9 && m!=11))|| m==8||m==10||m==12)
				System.out.println("Day="+31);
			else if(m%2==0 || m==9 || m==11)
				System.out.println("Day="+30);
		}
	}

}
