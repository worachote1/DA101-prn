import java.util.Scanner;

public class ch4_SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,choice;
		n=sc.nextInt();
		choice = sc.nextInt();
		int num[] = new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		
		//sort selection
		//0 -> min to max
		//1 -> max to min
		
		if(choice==0) {
			//System.out.println("prn 0");
			int minIndex;
			for(int i=0;i<n;i++) {
				minIndex = i;
				for(int j=i+1;j<n;j++) {
					if(num[minIndex]>num[j]) {
						minIndex = j;
					}
				}
				//swap
			//	System.out.println("prn swap");
				int temp = num[i];
				num[i]=num[minIndex];
				num[minIndex]=temp;
			}
		}
		else if(choice==1) {
			int maxIndex;
			for(int i=0;i<n;i++) {
				maxIndex=i;
				for(int j=i+1;j<n;j++) {
					if(num[maxIndex]<num[j]) {
						maxIndex=j;
					}
				}
				//swap
				int temp = num[maxIndex];
				num[maxIndex] = num[i];
				num[i] = temp;
			}
		}
		
		//display
		for(int i=0;i<n;i++) {
			System.out.println(num[i]);
		}
	}
}
