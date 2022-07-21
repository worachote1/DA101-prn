package Practice_loop;

public class Loop_number_pt {

	public static void pt_1() {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pt_2() {
		int n = 7;
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void pt_3(int n) {
		for(int i=0;i<n;i++) {		
			//for space
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}			
			//for  calculate
			int num = 1;
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num = num * (i-j) / (j+1);
			}	
			System.out.println();
		}
	}

	public static void pt_4() {
		int n = 8;
		int count = 1;
		//top half
		for(int i=1;i<=4;i++) {
			
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			//right side
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//left side
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//bottom half
		for(int i=3;i>=1;i--) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pt_5(int n) {
		int count = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
			}
			count++;
			System.out.println();
		}
	}
	
	public static void pt_6(int n) {
		
		for(int i=1;i<=n;i++) {
			int count = 8;
			for(int j=1;j<=i;j++) {
				System.out.print(count+" "); 
				count--;
			}
			System.out.println();
		}
	}
	
	public static void pt_7(int n) {
		
		for(int i=1;i<=n;i++) {
			int count = i;
			for(int j=0;j<i;j++) {
				System.out.print(count-j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_8(int n) {
		int num;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				//column is odd
				if(i%2!=0) {
					num = (j%2==0) ? 0:1 ;
				}
				//column is even
				else {
					 num = (j%2==0) ? 1:0 ;
				}
				System.out.print(num);
			}
			System.out.println();
		}
	}
	
	public static void pt_9(int n) {
		int num;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				num = (j%2==0) ? 0 : 1;
				System.out.print(num);
			}
			System.out.println();
		}
	}
	
	public static void pt_10(int n) {
		//top half
		for(int i=1;i<=n;i++) {
			//space
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//print num
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//bottom half
		for(int i=1;i<=n-1;i++) {
			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//print num
			for(int j=n-i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_11(int n) {
		//top half
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//bottom half
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_12(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_13(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_14(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n-i+1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_15(int n) {
		for(int i=1;i<=n;i++) {
			//right side
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			//left side
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_16(int n) {
		//top half
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//bottom half
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_17(int n) {
		//top half
		for(int i=1;i<=n;i++) {
			//space
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//print num
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//bottom half
		for(int i=n-1;i>=1;i--) {
			//space
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//print num
			for(int j=i;j<=9;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pt_19(int n) {
		int num;
		for(int i=1;i<=n;i++) {
			num = i;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num = num + n -j;
			}
			System.out.println();
		}
	}
	
	public static void pt_20(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pt_21(int n) {
		int min;
		//top
		for(int i=1;i<=n;i++) {
			//top left
			for(int j=1;j<=n;j++) {
				min = (i<j) ? i : j;
				System.out.print(n-min+1+" "); 
			}
			//top right
			for(int j=n-1;j>=1;j--) {  
				min = (i<j) ? i : j;
				System.out.print(n-min+1+" ");
			}
			System.out.println();
		}
		
		//bottom
		for(int i=n-1;i>=1;i--) {
			//bottom left
			for(int j=1;j<=n;j++) {
				min = (i<j) ? i : j;
				System.out.print(n-min+1+" ");
			}
			
			//bottom right
			for(int j=n-1;j>=1;j--) {
				min = (i<j) ? i : j;
				System.out.print(n-min+1+" ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		// pt_1();
		// pt_2();
		//pt_3(3);
		//pt_4();
		//pt_5(9);
		//pt_6(8);
		//pt_7(8);
		//pt_8(9);
		//pt_9(9);
		//pt_10(10);
		//pt_11(8);
		//pt_12(9);
		//pt_13(9);
		//pt_14(7);
		//pt_15(9);
		//pt_16(9);
		//pt_17(9);
		//pt_18(8);
		//pt_19(9);
		//pt_20(9);
		pt_21(7);
	}

}
