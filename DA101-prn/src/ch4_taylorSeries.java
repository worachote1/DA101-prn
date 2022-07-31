import java.util.Scanner;

public class ch4_taylorSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		int pFac = 1;
		for(int i=2;i>=1;i--) {
			pFac *= i;
		}
		
		double sumE = 1+x;
		for(int i=2;i<=4;i++) {
			if(i==2) {
				System.out.println(Math.pow(x, i)/(pFac));
				sumE += Math.pow(x, i)/(pFac);
			}
			else {
				pFac *= i;
				//System.out.println("pFac = "+pFac);
				System.out.println(Math.pow(x, i)/(pFac));
				sumE += Math.pow(x, i)/(pFac);
			}
				
		}
		//System.out.println(Math.pow(Math.E, x));
		System.out.println(sumE);
	}

}
