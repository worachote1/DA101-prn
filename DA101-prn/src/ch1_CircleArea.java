import java.util.Scanner;

public class ch1_CircleArea {

	public static void main(String[] args) {
		final double PI= 3.14159;
		double r,a;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		a = PI*r*r;
		System.out.println(a);
	}

}
