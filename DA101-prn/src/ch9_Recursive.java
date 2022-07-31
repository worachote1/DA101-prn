import java.math.BigInteger;
import java.util.Scanner;

public class ch9_Recursive {

	
	public static BigInteger fac(int n) {

		if (n == 0)
			return BigInteger.valueOf(1);

		BigInteger k = BigInteger.valueOf(n);
		return k.multiply(fac(n - 1));
	}
	
	public static BigInteger NcR(int n,int r) {
		if(r>0 && r<n)
			return fac(n).divide(fac(n-r).multiply(fac(r)));
		if(r==0 || n==r)
			return BigInteger.valueOf(1);
		return BigInteger.valueOf(0);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(NcR(n, k));
	}

}
