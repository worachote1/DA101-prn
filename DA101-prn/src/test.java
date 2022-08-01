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
		
		int M[][] = {	{1,1},
						{1,0}
			}; 
		
		int K[][] = {	{1,1,4},
				{1,0,2}
	}; 
		// R = M X K
		int R[][] = new int[M.length][K[0].length];
	
		for(int i=0;i<R.length;i++) {
			
			for(int j=0;j<R[0].length;j++) {
				int sum = 0;
				for(int k=0;k<K.length;k++) {
					sum += M[i][k] * K[k][j];
				}
				R[i][j]=sum;
			}
		};
		
		System.out.println("display metric");
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<M[0].length;j++) {
				System.out.print(R[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(10*Math.pow(3, 2));
	}
}
