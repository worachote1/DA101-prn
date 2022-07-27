import java.util.Scanner;

public class ch4_MovingAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int sum = 0;
			if(i==0)
				System.out.println((arr[0]+arr[1])/2);
			else if(i==n-1)
				System.out.println((arr[n-1]+arr[n-1-1])/2);
			else {
				sum = arr[i-1]+arr[i]+arr[i+1];
				System.out.println(sum/3);
			}
		}

	}

}
