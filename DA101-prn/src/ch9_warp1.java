import java.util.ArrayList;
import java.util.Scanner;

public class ch9_warp1 {

	public static String isWarp() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a,b;
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();

		int warpSpot[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				warpSpot[i][j] = sc.nextInt();
			}
		}
		
		//check warp 
		if(warpSpot.length==1) {
			if(warpSpot[0][1]==b) {
				System.out.println("yes");
				return;
			}
			System.out.println("no");
			return;
		}
		
		//check warp
		//save each start row index
		ArrayList<Integer> save_rowStart = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(warpSpot[i][0]==a)
				save_rowStart.add(i);
		}
		
		//use save_rowStart to check
		
		for(int i=0;i<save_rowStart.size();i++) {
			int colSave = warpSpot[i][1];
			for(int j=0;j<warpSpot.length;j++) {
				if(warpSpot[j][0] < a || warpSpot[j][0]==save_rowStart.get(i))
					continue;
				
				if(colSave==warpSpot[j][0])
					colSave =  warpSpot[j][1];
				
				if(colSave==b) {
					System.out.println("yes");
					return;
				}
			}
		}
		
		System.out.println("no");
		
		//test display
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<2;j++) {
//				System.out.print(warpSpot[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
