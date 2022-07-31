import java.util.Scanner;

public class ch3_PairSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String ss[] = s.split(" ");
		int result = sc.nextInt();
		//covert to int []
		int num[] = new int[ss.length];
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(ss[i]);
		}
		
		int count = 0;
		int n = num.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(num[i]+num[j]==result)
					count++;
			}
		}
		System.out.println(count);
	}

}
