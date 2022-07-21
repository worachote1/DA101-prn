package Practice_loop;

public class Loop_pt_1to15 {

	public static void pt_1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pt_2(int n) {
		for (int i = 0; i < n; i++) {
			// for space
			for (int j = (n - i); j > 0; j--) {
				System.out.print(" ");
			}
			// for *
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pt_3(int n) {
		for (int i = 0; i < n; i++) {
			// for space
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// for *
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pt_4(int n) {
		// top half
		for (int i = 0; i < n; i++) {
			// top-half space
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// top-half *
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// bottom half
		for (int i = n - 2; i >= 0; i--) {
			// bottom space
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// bottom *
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pt_5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pt_6(int n) {
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pt_7(int n) {
		for (int i = n; i > 0; i--) {
			// space
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void pt_8(int n) {
		for (int i = n; i > 0; i--) {
			// space
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pt_9(int n) {

		// top half
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// bottom half
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pt_10(int n) {

		// top half
		for (int i = 0; i < n; i++) {
			// top half space
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// top half *
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// bottom half
		for (int i = n - 1; i > 0; i--) {
			// bottom half space
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			// bottom half *
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pt_11(int n) {

		// top
		for (int i = 0; i < n; i++) {
			// top half space
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			// top half *
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// bottom
		for (int i = 0; i < n; i++) {
			// bottom half space
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// bottom half *
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pt_12() {
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (i != 0 && (j == 0 || j == n / 2) || i == 0 && j != n / 2 || i == n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	//Triangle Star Pattern
	public static void pt_13() {
		int n = 9;
		for(int i=0;i<n;i++) {
			//first space
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//second space and print *
			for(int j=0;j<2*i+1;j++) {
				if(j==0 || j==(2*i+1)-1 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Down Triangle Pattern
	public static void pt14() {
		int n=9;
		for(int i=n;i>0;i--) {
			//first space
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			//second space and print *
			for(int j=0;j<2*i-1;j++) {
				if(i==n || j==0 || j==(2*i-1)-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Diamond Star Pattern
	public static void pt_15(int n) {
		//top half
		for(int i=0;i<n;i++) {
			//first space
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			//second space and print *
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
	
	public static void main(String[] args) {

		// pt_1(6);
		// pt_2(6);
		// pt_3(6);
		// pt_4(8);
		// pt_5(7);
		// pt_6(8);
		// pt_7(8);
		// pt_8(8);
		// pt_9(8);
		// pt_10(10);
		// pt_11(10);
		//pt_12();
		//pt_13();
		//pt14();
		pt_15(5);
	}

}
