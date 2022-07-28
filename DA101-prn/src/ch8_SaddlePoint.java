import java.util.Scanner;

public class ch8_SaddlePoint {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int num[][] = new int [row][col];
		int minRow;
		int result = -1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				num[i][j]=sc.nextInt();
			}
		}
		
		Boolean isMAxCol = true;
		//find minRow then check if it's maxCol
		for(int i=0;i<row;i++) {
			int pFix_Col = 0;
			//find minRow
			minRow = num[i][0];
			//System.out.println("start minRow = "+minRow);
			for(int j=0;j<col;j++) {
				if(minRow>num[i][j]) {
					minRow=num[i][j];
					pFix_Col=j;
				}
			}
			//System.out.println("Now minRow = "+minRow);
			isMAxCol = true;
			//check maxCol
			for(int k=0;k<row;k++) {
				if(minRow<num[k][pFix_Col]) {
					//not maxCol
					isMAxCol=false;
					//System.out.println("maxcol : minRow "+minRow+" num = "+num[k][pFix_Col]);
					break;
				}
			}
			
			if(isMAxCol) {
				result = minRow;
				//System.out.println("prn isMax");
				break;
			}
		}
		if(!isMAxCol)
			System.out.println(-1);
		else 
			System.out.println(result);		
	}
}
