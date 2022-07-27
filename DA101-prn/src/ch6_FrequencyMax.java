import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ch6_FrequencyMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		ArrayList<Integer> maxFNum = new ArrayList<Integer>();
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		//sort
		Arrays.sort(num);
		int allF[] = new int[n];
		for(int i=0;i<num.length;i++) {
			int countF = 0;
			for(int j=0;j<num.length;j++) {
				if(num[i]==num[j]) {
					countF++;
					allF[i]++;
				}
			}
		}
		
		//find max f
		int maxF = 0;
		for(int i=0;i<num.length;i++) {
			if(maxF<allF[i]) {
				maxF=allF[i];
			}
		}
		
		//get max f num into arrayList
		for(int i=0;i<num.length;i++) {
			if(!maxFNum.contains(num[i])) {
				if(allF[i]==maxF) {
					maxFNum.add(num[i]);
				}	
			}
		}
		
		//display
		System.out.println(maxFNum.get(0));
	}

}
