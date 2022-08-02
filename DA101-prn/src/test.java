import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> prn = new ArrayList<int[]>();
		int e1[] = { 1, 2, 44 };
		int e2[] = { 56, 77, 24 };
		int e3[] = { 156, 887, 324 };
		prn.add(e1);
		prn.add(e2);
		prn.add(e3);

		// System.out.println(prn.get(1)[2]); //24

		int M[][] = { { 1, 1 }, { 1, 0 } };

		int K[][] = { { 1, 1, 4 }, { 1, 0, 2 } };
		// R = M X K
		int R[][] = new int[M.length][K[0].length];

		for (int i = 0; i < R.length; i++) {

			for (int j = 0; j < R[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < K.length; k++) {
					sum += M[i][k] * K[k][j];
				}
				R[i][j] = sum;
			}
		}
		;

		ArrayList<ArrayList<Integer>> testA = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();

//		a.add(1); a.add(12); a.add(23);
//		b.add(44); b.add(57);
//		c.add(33); c.add(87);
//		
//		testA.add(a);
//		testA.add(b);
//		testA.add(c);
//		
//		for(int i=0;i<testA.size();i++) {
//			for(int j=0;j<testA.get(i).size();j++) {
//				System.out.print(testA.get(i).get(j)+" ");
//			}
//			System.out.println();
//		}

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		int max = 10;
		int min = 1;
		int range = max - min + 1;
		int k = 0;
		for (int i = 1; i <= 4; i++) {
			ArrayList<Integer> save_result = new ArrayList<>();
			int rand = (int)(Math.random() * range) + min;
			save_result.add(rand);
			result.add(save_result);
		}

		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {

				System.out.print(result.get(i).get(j) + " ");
			}
		}
	}
}
