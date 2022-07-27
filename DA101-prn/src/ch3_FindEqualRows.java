import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ch3_FindEqualRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Boolean haveDigit[] = new Boolean [10];
		String s = sc.nextLine();
		sc.close();
		Boolean miss;
		ArrayList<Integer> missArr = new ArrayList<Integer>();
		for(int i=0;i<=9;i++) {
			miss = true;
			for(int j=0;j<s.length();j++) {
				if(i==s.charAt(j)-'0') {
					miss = false;
					break;
				}
			}
			if(miss) {
				missArr.add(i);
			}
		}
		
		if(missArr.size()==0) 
		{
			System.out.println("No missing digits"); 
			return;
		}
		//sort missArray then display
		Collections.sort(missArr);
		for(int i=0;i<missArr.size();i++) {
			System.out.print(missArr.get(i));
			if(i!=missArr.size()-1) {
				System.out.print(" ");
			}
		}
	}

}
