package DST0_BigO_Sort;

import java.util.Date;

public class FindMaximumSubsequenceSum {

	public static int mss1(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int sum = 0;
				for (int k = i; k < j; k++) {
					sum += a[k];
				}
				if (max < sum) {
					max = sum;
				}
			}
		}
		return max;
	}

	public static int mss2(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[i]; // a[j]
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

	public static int mss3(int[] a) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

			if (sum < 0) {
				sum = 0;
			}
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int test[] = new int[1000];
		for(int i=0;i<test.length;i++) {
			test[i] = (int)(Math.random()*test.length-test.length/2);
		}
		int m;
		long t1,t2;
		t1 = System.currentTimeMillis();
		m=mss1(test);
		t2 = System.currentTimeMillis();
		System.out.println("subsequence sum O(n^3) : "+m+" time : "+(t2-t1) +" milliseconds");
		
		t1 = System.currentTimeMillis();
		m=mss1(test);
		t2 = System.currentTimeMillis();
		System.out.println("subsequence sum O(n^2) : "+m+" time : "+(t2-t1)+" milliseconds");
		
		t1 = System.currentTimeMillis();
		m=mss1(test);
		t2 = System.currentTimeMillis();
		System.out.println("subsequence sum O(n) : "+m+" time : "+(t2-t1)+" milliseconds");
	}

}
