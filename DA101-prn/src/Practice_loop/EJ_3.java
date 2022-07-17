package Practice_loop;

public class EJ_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//top and bottom
				if(i==0 || i==n-1) {
					System.out.print("*");
				}
				else {
					if(j==i || j==n-1-i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
	}

}
