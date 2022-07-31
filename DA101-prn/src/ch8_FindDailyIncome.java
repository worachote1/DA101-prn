import java.util.Arrays;
import java.util.Scanner;

public class ch8_FindDailyIncome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		double price[] = new double[n];
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			price[i]=Double.parseDouble(s.split("\t")[1]);
		}
		int row,col;
		int day = 5;
		row=n;
		col=day;
		double income[][] = new double [row][col];
		for(int i=0;i<row;i++) {
			String s = sc.nextLine();
			for(int j=0;j<col;j++){
				income[i][j] = Double.parseDouble(s.split("\t")[j+1]);
			}
		}
		
		//display
		for(int i=0;i<col;i++) {
			double sum = 0;
			for(int j=0;j<row;j++) {
				sum += price[j]*income[j][i];
			}
			System.out.println(sum);
		}
	}

}
