import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ch9_warp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a, b;
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();

		int warpSpot[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				warpSpot[i][j] = sc.nextInt();
			}
		}

		// check warp
		if (warpSpot.length == 1) {
			if (warpSpot[0][1] == b && warpSpot[0][0]==a) {
				System.out.println(warpSpot[0][0]+"->"+warpSpot[0][1]);
				return;
			}
			System.out.println("no");
			return;
		}

		// check warp
		// save each start row index
		ArrayList<Integer> save_rowStart = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (warpSpot[i][0] == a)
				save_rowStart.add(i);
		}
		
		//test display save_rowStart
		System.out.println("display save_rowStart which size = "+save_rowStart.size());
		for(int i=0;i<save_rowStart.size();i++) {
			System.out.println(save_rowStart.get(i)+" : "+warpSpot[save_rowStart.get(i)][0]+" "+warpSpot[save_rowStart.get(i)][1]);
		}
		System.out.println();
		// use save_rowStart to check
		ArrayList<int[]> result = new ArrayList<int[]>();
		
		for (int i = 0; i < save_rowStart.size(); i++) {
			int colSave = warpSpot[save_rowStart.get(i)][1];
			if (colSave == b) {
				//System.out.println("prn warpSpot[i]->"+Arrays.toString(warpSpot[save_rowStart.get(i)]) );
				result.add(warpSpot[save_rowStart.get(i)]);
				System.out.println("ss");
				continue;
			}
			int save_result[] = new int[444];
			save_result[0]=a;
			int rs = 1;
			for (int j = 0; j < warpSpot.length; j++) {

				if (warpSpot[j][0] < a || warpSpot[j][0] == warpSpot[save_rowStart.get(i)][0])
					continue;

				if (colSave == warpSpot[j][0]) {
					save_result[rs++]=colSave;
					colSave = warpSpot[j][1];
				}

				if (colSave == b) {
					//System.out.println("yes");
					save_result[rs++]=colSave;
					int temp_result[] = new int[rs];
					for(int k=0;k<temp_result.length;k++) {
						temp_result[k]=save_result[k];
					}
					result.add(temp_result);
					//System.out.println("prn == b which temp = "+Arrays.toString(temp_result));
					break;
					//return;
				}
			}
		}

		if(result.size()==0) {
			System.out.println("no");
			return;
		}
		
		System.out.println("res size = "+result.size());
		//System.out.println("display output");
		//sort which warp to be printed first
		for(int i=0;i<result.size()-1;i++) {
			for(int j=0;j<result.size()-1;j++) {
				if(result.get(j)[1]>result.get(j+1)[1]) {
					int temp[] = new int[result.get(j).length];
					for(int k=0;k<temp.length;k++) {
						temp[k]=result.get(j)[k];
					}
					result.set(i, result.get(j+1));
					result.set(i+1, temp);
				}
			}
		}
		
		for(int i=0;i<result.size();i++) {
			for(int j=0;j<result.get(i).length;j++) {
				System.out.print(result.get(i)[j]);
				if(j!=result.get(i).length-1)
					System.out.print("->");
			}
			System.out.println();
		}

	}

}
