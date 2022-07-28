import java.util.Arrays;
import java.util.Scanner;

public class ch5_NumberCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nextNum[] = new int[n];
		for (int i = 0; i < nextNum.length; i++) {
			nextNum[i] = sc.nextInt();
		}

		int p = 1;
		if (n == 1) {
			System.out.print(p);
			return;
		} else
			System.out.print(p + " ");

		int count=0;
		while (count != n - 1) {
			System.out.print(nextNum[p - 1]);
			p=nextNum[p - 1];
			count++;
			if(count != n - 1)
				System.out.print(" ");
		}
	}

}
