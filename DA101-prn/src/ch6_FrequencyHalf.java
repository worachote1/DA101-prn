import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ch6_FrequencyHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int num_temp[] = new int[1000];
		int num[];
		while(true) {
			int k = sc.nextInt();
			if(k==-1)
				break;
			num_temp[n]=k;	
			n++;
		}
		
		//clone to num[]
		num = new int[n];
		for(int i=0;i<num.length;i++) {
			num[i]=num_temp[i];
		}
		//find Frequency half
		int countFH;
		Boolean notFH = true;
		ArrayList<Integer> sameNum = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++) {
			countFH = 0;
			//check if it's same sum
			if(sameNum.contains(num[i])) {
				continue;
			}
			for(int j=i;j<num.length;j++) {
				if(num[i]==num[j]) {
					countFH++;
				}
			}
			if(countFH>num.length/2) {
				System.out.print(num[i]);
				notFH = false;
				sameNum.add(num[i]);
			}
		}
		if(notFH) {
			System.out.println("Not found");
		}
	}

}
