import java.math.BigInteger;
import java.util.Scanner;

public class ch9_Factorial {

	public static BigInteger fac(int n) {

		if (n == 0)
			return BigInteger.valueOf(1);

		BigInteger k = BigInteger.valueOf(n);
		return k.multiply(fac(n - 1));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fac(n));
	}

}
