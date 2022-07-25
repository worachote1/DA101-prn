import java.util.Scanner;

public class ch3_FindEqualRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean haveDigit[] = new Boolean [10];
		String s = sc.nextLine();
		//set Boolean
		for(int i=0;i<10;i++) {
			haveDigit[i]=false;
		}
		
		//set after check
		for(int i=0;i<s.length();i++) {
			//convert char to int 
			int k = Integer.parseInt(String.valueOf(s.charAt(i))); 
			haveDigit[k]=true;
		}
		
		

		int count = 0;
		//display which digit is miss
		for(int i=0;i<haveDigit.length;i++) {
			if(!haveDigit[i])
				System.out.print(i+" ");
			else 
				count++;
		}
		//if there are no missing digit
		if(count==haveDigit.length) {
		
			System.out.println("No Missing digits");
		}
	}

}
