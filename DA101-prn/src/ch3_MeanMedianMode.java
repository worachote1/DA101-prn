import java.util.Arrays;
import java.util.Scanner;

public class ch3_MeanMedianMode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		// sort num
		Arrays.sort(num);
//		System.out.println("display after sort");
//		for(int i=0;i<n;i++) {
//			System.out.print(num[i]+" ");
//		}
//		System.out.println();
		
		double mean, median;
		int mode;
		// find mean
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += num[i];
		}
		mean = sum / n;
		System.out.println(mean);

		// find median
		double posCeil = Math.ceil((n + 1) / 2.0);
		double posFloor = Math.floor((n + 1) / 2.0);

		if (posCeil == posFloor) {
			mean = num[(int) (posCeil - 1)];
			//System.out.println("prn if -> "+num[(int) (posCeil - 1)]);
		} else {
			mean = (num[(int) (posCeil - 1)] + num[(int) (posFloor - 1)]) / 2;
			//System.out.println("prn else -> "+num[(int) (posCeil - 1)]);
			//System.out.println("prn else -> "+num[(int) (posFloor - 1)]);
		}
		System.out.println(mean);
		
		//find mode
		int maxCount = 0;
		mode = num[0];
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<n;j++) {
				if(num[i]==num[j]) {
					count++;
				}
			}
			if(maxCount<count) {
				mode = num[i];
				maxCount = count;
			}
		}

		System.out.println(mode);
	}

}
