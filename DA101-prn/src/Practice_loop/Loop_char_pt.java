package Practice_loop;

public class Loop_char_pt {

	public static void pt1() {
		int alphabet = 65;
		for(int i = 0;i<9;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt2() {
		int alphabet = 65;
		for(int i = 0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+i)+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt3() {
		int alphabet = 65;
		int n=9;
		//top half
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
		//bottom half
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt4() {
		int alphabet = 65;
		int n=9;
		for(int i=0;i<n;i++) {
			//space
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			//print alphabet
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt5_test() {
		int n = 9;
		//top half
		for(int i=0;i<n;i++) {
			//first space
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			//print * and second space
			for(int j=0;j<2*i+1;j++) {
				if(j==0 || j==(2*i+1)-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//bottom half
		for(int i=n-1;i>0;i--) {
			//first space
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			//second space and print *
			for(int j=0;j<2*i-1;j++) {
				if(j==0 || j==(2*i-1)-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pt5(char c) {
		c = Character.toUpperCase(c);
		int alphabet = 65;
		int n=((int)c-alphabet)+1;
		//System.out.print(n);
		//top half
		for(int i=0;i<n;i++) {
			//first space
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			//second space and print alphabet
			for(int j=0;j<i*2+1;j++) {
				if(j==0 || j==(i*2+1)-1) {
					System.out.print((char)(alphabet+i));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//bottom half
		for(int i=n-1;i>0;i--) {
			//first space
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			//second space and print alphabet
			for(int j=0;j<2*i-1;j++) {
				if(j==0 || j==(2*i-1)-1) {
					System.out.print((char)(alphabet+i-1));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		//pt1();
		//pt2();
		//pt3();
		//pt4();
		//pt5_test();
		pt5('P');
	}

}
