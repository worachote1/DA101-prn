import java.util.Scanner;

public class ch1_AvgOfFive {

	public static void main(String[] args) {
		double n[] = new double[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n.length;i++) {
			n[i] = sc.nextDouble();
		}
		double sum = 0;
		for(int i=0;i<n.length;i++) {
			sum += n[i];
		}
		System.out.println(sum/5);
	}

}
