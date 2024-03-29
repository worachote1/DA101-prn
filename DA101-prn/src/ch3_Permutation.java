import java.math.BigInteger;
import java.util.Scanner;

public class ch3_Permutation {
	
	public static BigInteger fac(int n) {

		if (n == 0)
			return BigInteger.valueOf(1);

		BigInteger k = BigInteger.valueOf(n);
		return k.multiply(fac(n - 1));
	}
	
	public static BigInteger NpR(int n,int r) {
		return fac(n).divide(fac(n-r));
	}
	public static BigInteger NcR(int n,int r) {
		return fac(n).divide(fac(n-r).multiply(fac(r)));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int choice = sc.nextInt();
		
		if(choice==1) {
			System.out.println(NpR(n, r)); 
			return;
		}
		
		System.out.println(NcR(n, r)); 
	}

}
