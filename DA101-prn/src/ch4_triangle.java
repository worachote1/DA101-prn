import java.util.Scanner;

public class ch4_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a,b,c;
		int count=0;
		//find how many set of pythagorean
		for(c=1;c<=l;c++) {
			for(b=1;b<=c;b++) {
				for(a=1;a<=b;a++) {
					if(c*c==(b*b)+(a*a) && l==c+b+a) {
						System.out.println("c = "+c+" b = "+b+" a = "+a);
						//System.out.println(c);
					}
					
				}
				
			}
		}
		//System.out.println("count prn = "+count);
		//find most sides
//		int k=0;
//		for(c=1;c<=l;c++) {
//			for(b=1;b<=c;b++) {
//				for(a=1;a<=b;a++) {
//					if(c*c==(b*b)+(a*a)) {
//						System.out.println("c = "+c+" b = "+b+" a = "+a);
//					}
//				}
//			}
//		}
		//System.out.println(count);
	}

}
