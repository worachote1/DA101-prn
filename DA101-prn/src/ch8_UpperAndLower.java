import java.util.Scanner;

public class ch8_UpperAndLower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice,n;
		choice = sc.nextInt();
		n=sc.nextInt();
		
		int num[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				num[i][j]=sc.nextInt();
			}
		}
		
		int sum = 0;
		if(choice == 0) {
			//sum bottom triangle
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					sum += num[i][j];
				}
			}
		}
		else if(choice == 1) {
			//sum top triangle
			for(int i=0;i<n;i++) {
				for(int j=n-1;j>=i;j--) {
					sum += num[i][j];
				}
			}
		}
		
		System.out.println(sum);
	}

}
