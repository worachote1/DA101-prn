import java.math.BigInteger;
import java.util.Scanner;

public class ch9_fibonacci_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		
		BigInteger Fn;
		BigInteger M[][] = {	{BigInteger.valueOf(1),BigInteger.valueOf(1)},
						{BigInteger.valueOf(1),BigInteger.valueOf(0)}
					}; 
		
		BigInteger A[][] = {	{BigInteger.valueOf(1),BigInteger.valueOf(1)},
				{BigInteger.valueOf(1),BigInteger.valueOf(0)}
			}; 

		if(n==1) {
			Fn = M[0][1];
			System.out.println(Fn.mod(BigInteger.valueOf(k)));
			return;
		}
		if(n==0) {
			System.out.println(0);
			return;
		}
		
		//use Divide and conquer algorithm
		//n is even
		if(n%2==0) {
			int count = 1;
			while(count<n/2) {
				BigInteger  R[][] = new BigInteger[M.length][M[0].length];
				
				for(int i=0;i<M.length;i++) {
					
					for(int j=0;j<M[0].length;j++) {
						BigInteger sum = BigInteger.valueOf(0);
						for(int m=0;m<M.length;m++) {
							//System.out.println("M[i][m] = "+M[i]);
							sum = sum.add((M[i][m].multiply(A[m][j])));
							
						}
						R[i][j]=sum;
					}
				}
				
				count++;
				M = R;
				
//				System.out.println("display metric n = "+count);
//				for(int i=0;i<M.length;i++) {
//					for(int j=0;j<M[0].length;j++) {
//						System.out.print(M[i][j]+" ");
//					}
//					System.out.println();
//				}
			}
			
			//pow 2
			BigInteger  R[][] = new BigInteger[M.length][M[0].length];
			
			for(int i=0;i<M.length;i++) {
				
				for(int j=0;j<M[0].length;j++) {
					BigInteger sum = BigInteger.valueOf(0);
					for(int m=0;m<M.length;m++) {
						//System.out.println("M[i][m] = "+M[i]);
						sum = sum.add((M[i][m].multiply(M[m][j])));
						
					}
					R[i][j]=sum;
				}
			}
			M = R;
			
		}
		
		//n is odd
		else if(n%2!=0) {
			int count = 1;
			BigInteger  temp_M[][] = new BigInteger[M.length][M[0].length];
			//clone to temp
			for(int i=0;i<M.length;i++) {
				for(int j=0;j<M[0].length;j++) {
					 temp_M[i][j] = M[i][j];
				}
			}
			while(count<n-1) {
				BigInteger  R[][] = new BigInteger[M.length][M[0].length];
				
				for(int i=0;i<M.length;i++) {
					
					for(int j=0;j<M[0].length;j++) {
						BigInteger sum = BigInteger.valueOf(0);
						for(int m=0;m<M.length;m++) {
							//System.out.println("M[i][m] = "+M[i]);
							sum = sum.add((M[i][m].multiply(A[m][j])));
							
						}
						R[i][j]=sum;
					}
				}
				
				count++;
				M = R;
//				System.out.println("display metric n = "+count);
//				for(int i=0;i<M.length;i++) {
//					for(int j=0;j<M[0].length;j++) {
//						System.out.print(M[i][j]+" ");
//					}
//					System.out.println();
//				}
			}
			
			
			BigInteger  R[][] = new BigInteger[M.length][M[0].length];
			
			for(int i=0;i<M.length;i++) {
				
				for(int j=0;j<M[0].length;j++) {
					BigInteger sum = BigInteger.valueOf(0);
					for(int m=0;m<M.length;m++) {
						//System.out.println("M[i][m] = "+M[i]);
						sum = sum.add((temp_M[i][m].multiply(M[m][j])));
						
					}
					R[i][j]=sum;
				}
			}
			M = R;
		}
		
		Fn = M[0][1];
		System.out.println(Fn.mod(BigInteger.valueOf(k)));
	}
	
}
