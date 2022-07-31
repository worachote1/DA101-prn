import java.util.Scanner;

public class ch3_car {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1,m1,h2,m2;
		h1 = sc.nextInt();
		m1=sc.nextInt();
		h2=sc.nextInt();
		m2=sc.nextInt();
		
		
		int price=0;
		int hDelta=h2-h1;
		int mDelta=m2-m1;
		
		if(hDelta>6 || (hDelta==6 && mDelta>0)) {
			
			price=200;
			System.out.println(price);
		}
		else if(hDelta>=4) {
			//int k = 1;
			for(int i=h1;i<=h2;i++) {
				price += 20;
			}
			if(mDelta!=0)
				price += 20;
			System.out.println(price);
		}
		else if(hDelta>=0){
			if(hDelta==0 && mDelta<=15) {
				System.out.println(price);
				return;
			}
			//more than 15 min but not more than 3 hours
			if(hDelta==3 && mDelta==0) {
				price = 10*3;
				System.out.println(price);
				return;
			}
			else {
				price=10;
				System.out.println(price);
				return;
			}
		}
	}

}
