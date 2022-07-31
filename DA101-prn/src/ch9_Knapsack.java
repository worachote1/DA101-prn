import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ch9_Knapsack {

	public static int KS(int i,ArrayList<Integer>w,ArrayList<Integer>v,int x) {
		
		if(i<0)
			return 0;
		if(x>=w.get(i)) {
			return Math.max(KS(i-1, w, v,x), KS(i-1,w,v,x-w.get(i))+v.get(i));
		}
		else
			return KS(i-1, w, v, x);
			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>w = new ArrayList<Integer>();
		ArrayList<Integer>v = new ArrayList<Integer>();
		
		
		String s = sc.nextLine();
		String sW[] = s.split(" ");
		//sc.nextLine();
		s = sc.nextLine();
		String sV[] = s.split(" ");
		int WLimit = sc.nextInt();
		
		for(int i=0;i<sW.length;i++) {
			w.add(Integer.parseInt(sW[i]));
		}
		for(int i=0;i<sV.length;i++) {
			v.add(Integer.parseInt(sV[i]));
		}
		
		int result = KS(w.size()-1, w, v, WLimit);
		System.out.println(result);
	}

}
