import java.util.Scanner;

public class ch6_Tax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double income = sc.nextDouble();
		double taxPay = 0;
		//double taxRate=0;
		if(income>4000000) {
			double k = income-4000000;
			taxPay += (k)*(37/100.0);
			income -= k;
		}
		if(income>1000000) {
			//income -= 1000000;
			double k = income-1000000;
			taxPay += (k)*(30/100.0);
			income -= k;
		}
		if(income>500000) {
			///income -= 500000;
			double k = income-500000;
			taxPay += (k)*(20/100.0);
			income -= k;
		}
		if(income>100000) {
			//income -= 100000;
			double k = income-100000;
			taxPay += (k)*(10/100.0);
			income -= k;
		}
		if(income>0) {
			taxPay += income*(5/100.0);
		}
		
		System.out.println(taxPay);
	}

}
