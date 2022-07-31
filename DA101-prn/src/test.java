import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> prn = new ArrayList<int[]>();
		int e1[] = {1,2,44};
		int e2[] = {56,77,24};
		int e3[] = {156,887,324};
		prn.add(e1);
		prn.add(e2);
		prn.add(e3);
		
		System.out.println(prn.get(1)[2]); //24
		
		ArrayList<String[]> s = new ArrayList<String[]>();
		String s1[] = {"1","2","44"};
		String s2[] = {"1","2","44"};
		String s3[] = {"a", "b", "c", "d"};//{"-2","1","5","6"};
		s.add(s1);
		
		System.out.println("'sd\\ds");
		System.out.println("BigInt");
		System.out.println(Math.pow(55, 64/2));
		BigInteger bigInteger = new BigInteger("10000000000000000000000000000000");
		BigInteger p = new BigInteger("44");
		System.out.println(bigInteger);
		System.out.println(bigInteger.mod(p));
		
//		String sr = String.valueOf((BigInteger)Math.pow(55, 64/2));
//		System.out.println(sr+44);
		//55 64 33
		int a = 55;
		int k = 64;
		int m = 33;
		//k /= 2;
		BigInteger A = BigInteger.valueOf(a);
		BigInteger K = BigInteger.valueOf(k);
		BigInteger M = BigInteger.valueOf(m);
		
		BigInteger t = (A.pow(k/2)).mod(M);
		
		System.out.println(t.pow(2).mod(M)); 
		
	}

}
