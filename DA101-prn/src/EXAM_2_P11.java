

import java.util.Scanner;

public class EXAM_2_P11 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String com_name[] = new String[n];
		int m[] = new int[n];
		double ageAvg[] = new double[n];
		sc.nextLine();
		//get company name and number of officer
		for(int i=0;i<n;i++) {
			String ss[] = sc.nextLine().split(" ");
			com_name[i] = ss[0];
			m[i]= Integer.parseInt(ss[1]);
		}
		
		//get detail , age then find avg of each company
        for(int i=0;i<n;i++) {
        	int age = 0;
        	for(int j=0;j<m[i];j++) {
            	String ss[] = sc.nextLine().split(" ");
                age += Integer.parseInt(ss[3]);        		
        	}
        	ageAvg[i] = (double)age/m[i];
        }
		
        sc.close();
        //sort company by alphabet
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<n-1-i;j++) {
        		if((int)com_name[j].charAt(0)>(int)com_name[j+1].charAt(0)) {
        			//swap company name
        			String temp_comName = com_name[j+1];
        			com_name[j+1]=com_name[j];
        			com_name[j]=temp_comName;
        			//swap avg age of each company
        			double temp_comAvg = ageAvg[j+1];
        			ageAvg[j+1]=ageAvg[j];
        			ageAvg[j]=temp_comAvg;
        		}
        	}
        }
        
		//final display company name and avg of age
		for(int i=0;i<n;i++) {
			System.out.println(com_name[i]);
			System.out.println(ageAvg[i]);
		}
	}

}
