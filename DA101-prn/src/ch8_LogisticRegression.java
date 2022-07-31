import java.util.Scanner;

public class ch8_LogisticRegression {

	public static void main(String[] args) {
		double data[][] = {
				{15,3.78},{29,2.00},{10,2.50},{25,2.85},{30,3.96}
		};
		
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		if(id<1||id>5) {
			System.out.println("Error");
			return;
		}
			
		double score = data[id-1][0];
		double gpa = data[id-1][1];
		double logitP = -3.98+0.2*score+0.5*gpa;
		double pX = 1/(1+Math.pow(Math.E, -1*logitP));
	
		if(pX>0.5) {
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

}
