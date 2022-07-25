import java.util.Scanner;

public class ch1_BodySurface {

	public static void main(String[] args) {
		
		double body_surface;
		double w,h;
		Scanner sc = new Scanner(System.in);
		w = sc.nextDouble();
		h = sc.nextDouble();
		body_surface =  3.207 * Math.pow(10, -4)
				*Math.pow(h, 0.3)*Math.pow(1000*w,0.7285-0.0188*(3+Math.log10(w)));
		
		System.out.println(body_surface);
	}

}
