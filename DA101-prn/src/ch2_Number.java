import java.util.Scanner;

public class ch2_Number {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		if(n>100000) {
			return;
		}
		if(n==1) {
			System.out.println(1);
			return;
		}
		int count = 0;
		for(int i=n-1;i>1;i--) {
			if(n%i==0) {
				count++;
				System.out.print(i+" ");
			}
		}
		if(count == 0) {
			System.out.println("Prime Number");
		}
	}

}
