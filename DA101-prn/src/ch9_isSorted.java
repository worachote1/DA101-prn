import java.util.Scanner;

public class ch9_isSorted {

	public static boolean isSorted(int num[],int n) {
		if(n==1)
			return true;
		if(n==2) {
			if(num[n-1]<num[n-2]) {
				if(num[n-1]<num[n])
					return false;
			}
			else if(num[n-1]>num[n-2]) {
				if(num[n-1]>num[n])
					return false;
			}
			return true;
		}
		//descending order
		if(num[n-1]<num[n-2]) {
			if(num[n-2]>num[n-3])
				return false;
		}
		//ascending order
		else if(num[n-1]>num[n-2]) {
			if(num[n-2]<num[n-3]) 
				return false;
		}
		
		return isSorted(num, n-1);
	}
	
	public static boolean isSorted(int num[]) {
		return isSorted(num,num.length);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		
		if(isSorted(num)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
