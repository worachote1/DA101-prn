import java.math.BigInteger;
import java.util.Scanner;

public class Ch9_PowerMod {
	
	public static BigInteger powerMod(int a,int k,int m) {
		if(k==0)
			return BigInteger.valueOf(1);
		
		BigInteger A = BigInteger.valueOf(a);
		BigInteger K = BigInteger.valueOf(k);
		BigInteger M = BigInteger.valueOf(m);
		if(k%2==0) {	
			BigInteger t = (A.pow(k/2)).mod(M);
			//System.out.println("even t = "+t);
			return  (t.pow(2)).mod(M);
		}
		
		BigInteger t = (A.pow(k/2)).mod(M);
		//System.out.println("odd t = "+t);
		return (A.multiply(t.pow(2))).mod(M);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,k,m;
		a=sc.nextInt();
		k=sc.nextInt();
		m=sc.nextInt();
		sc.close();
		System.out.println(powerMod(a, k, m));
	}

}
