import java.util.Scanner;

public class ch6_Frequency {

	public static void main(String[] args) {
		
		int n,target;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		target = sc.nextInt();
		
		int num[] = new int[n];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		int countF = 0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==target) {
				countF++;
			}
		}
		System.out.println(countF);
	}

}
