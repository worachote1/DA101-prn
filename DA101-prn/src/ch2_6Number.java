import java.util.Scanner;

public class ch2_6Number {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n[] = new int[6];
			for(int i=0;i<n.length;i++) {
				n[i]=sc.nextInt();
			}
			int max = n[0];
			//find max
			for(int i=0;i<n.length;i++) {
				if(max<n[i]) {
					max = n[i];
				}
			}
			System.out.println(max);
	}

}
