import java.util.Scanner;

public class ch4_NewtonMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a,b,c,x,d;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		x=sc.nextDouble();
		d=sc.nextDouble();
		
		// Xn+1 = Xn - (F(Xn)/F'(Xn))
		// F(Xn)/F'(Xn) = Xn - Xn+1
		int n=0;
		double xx;
		double f = a*x*x+b*x+c; 
		double fDiff = 2*a*x+b;
		xx = x - f/fDiff;
		if(Math.abs(xx-x)<=d) {
			System.out.println(n);
			return;
		}
		while(Math.abs(xx-x)>d) {
			x = xx;
			f = a*x*x+b*x+c;
			fDiff = 2*a*x+b;
			xx = x - f/fDiff;
			n++;
		}
		System.out.println(n+1);
	}

}
