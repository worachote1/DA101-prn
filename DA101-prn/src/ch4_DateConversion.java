import java.util.ArrayList;
import java.util.Scanner;

public class ch4_DateConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss[] = s.split("/");
	
		String ssDay,ssMonth,ssYear;
		ssDay = ss[1];
		ssMonth = ss[0];
		ssYear  = ss[2];
	
		ArrayList<String> m = new ArrayList<String>();
		m.add("JAN");
		m.add("FEB");
		m.add("MAR");
		m.add("APR");
		m.add("MAY");
		m.add("JUN");
		m.add("JUL");
		m.add("AUG");
		m.add("SEP");
	    m.add("OCT");
	    m.add("NOV");
	    m.add("DEC");
	    
	    //convert month format
	    if(ssMonth.charAt(0)=='0') {
	    	ssMonth = Character.toString(ssMonth.charAt(1));
	    }
	    
	   // System.out.println(ssMonth);
	    
	    for(int i=0;i<m.size();i++) {
	    	if(Integer.parseInt(ssMonth)==i+1) {
	    		ssMonth = m.get(i);
	    		break;
	    	}
	    }
	    
	    //display
	    System.out.println(ssDay+" "+ssMonth+" "+ssYear);
	}

}
