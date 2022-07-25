import java.util.Scanner;

public class ch2_AvgOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//double arr[];
		double arr[] = new double[44444];
	
		int i=0;
		while(true) {
			arr[i]=sc.nextDouble();
			if(arr[i]==-1) 
				break; 
			i++;
		}
		if(i==0) {
			System.out.println("No Data");
			return;
		}
		double sum = 0;
		for(int j=0;j<i;j++) {
			sum += arr[j];
		}
		//find avg
		System.out.println(sum/i);
		
	}

}
