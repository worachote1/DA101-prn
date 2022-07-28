import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> prn = new ArrayList<int[]>();
		int e1[] = {1,2,44};
		int e2[] = {56,77,24};
		int e3[] = {156,887,324};
		prn.add(e1);
		prn.add(e2);
		prn.add(e3);
		
		System.out.println(prn.get(1)[2]); //24
		
		ArrayList<String[]> s = new ArrayList<String[]>();
		String s1[] = {"1","2","44"};
		String s2[] = {"1","2","44"};
		String s3[] = {"1","2","44"};
		s.add(s1);
		
	}

}
