import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ch7_TripleSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		N = sc.nextInt();
		M=sc.nextInt();
		int nNum[] = new int[N];
		int mNum[] = new int[M];
		Boolean isFound[] = new Boolean[M];
		for(int i=0;i<isFound.length;i++) {
			isFound[i]=false;
		}
		for(int i=0;i<N;i++) {
			nNum[i]=sc.nextInt();
		}
		for(int i=0;i<M;i++) {
			mNum[i]=sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(nNum));
//		System.out.println(Arrays.toString(mNum));

		//find subset and if length of that sub is 3 add to saveNum
		ArrayList<int[]> saveNum = new ArrayList<int[]>();
	    int n=N;
	    
			for (int i = 0; i < (1<<n); i++)
	        {
	           // System.out.print("{ ");
	 
	            // Print current subset
				//System.out.println("i = "+i);
				int temp[] = new int [3];
				int count = 0;
	            for (int j = 0; j < n; j++) {
	            	
	            	//System.out.println("before j = "+j);
	            	
	            	if ((i & (1 << j)) > 0) {
	                	//System.out.println("1 << j = "+(1<<j));
	                	//System.out.print(s3[j] + " ");
	                	//System.out.println("after (1 << j) = "+(1 << j)+" , s3[j] = "+nNum[j]);
	                	
	                	temp[count]=nNum[j];
	                	count++;
	                	if(count==3) {
	                		//System.out.println("prn 3");
	                		//System.out.println("i = "+i);
	                		int temp2[] = new int [3];
	                		for(int t=0;t<3;t++) {
	                			temp2[t]=temp[t];
	                		}
	                		if(!saveNum.contains(temp2)) {
	                			saveNum.add(temp2);
	                		}
	              
	                		break;
	                	}
	                }
	            }
	           // System.out.println();
	            //System.out.println("}"+" i -> "+i);
	        }
			
			
			//test display subset of 3 length
//			for(int i=0;i<saveNum.size();i++) {
//				for(int j=0;j<saveNum.get(i).length;j++) {
//					System.out.print(saveNum.get(i)[j]+" ");
//				}
//				System.out.println();
//			}
			
			//test set Boolean
			
				for(int i=0;i<saveNum.size();i++) {
					int sum = 0;
					for(int j=0;j<saveNum.get(i).length;j++) {
						sum += saveNum.get(i)[j];
					}
					for(int p=0;p<isFound.length;p++) {
						if(sum==mNum[p]) {
							isFound[p]=true;
							//System.out.println("found M that sum = "+sum);
							break;
						}
					}
				}
				
				for(int p=0;p<isFound.length;p++) {
					if(isFound[p]) {
						System.out.println("YES");
						continue;
					}
					System.out.println("NO");
				}
			
	}
	/*
	4 5
	-2 1 5 6
	1 3 5 6 7
	*/
}
