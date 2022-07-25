import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ch1_AnalyzeScore {

	public static void main(String[] args) {
		String studentID[] = new String[3];
		String gradeStudent[] = new String[3];
		Scanner prn = new Scanner(System.in);
		String nameFile = prn.nextLine();
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\User PC\\git\\DA101-prn\\DA101-prn\\src\\"+nameFile));
			int i = 0;
			while (sc.hasNextLine()) {
				//System.out.println(sc.nextLine());
				String ss[] = sc.nextLine().split(" ");
				studentID[i] = ss[0];

				int score = 0;
				for(int j=1;j<=5;j++) {
					score += Integer.parseInt(ss[j]);
				}
				//check which grade
				if(score>=80&&score<=100) {
					gradeStudent[i]="A";
				}
				else if(score >= 75) {
					gradeStudent[i]="B+";
				}
				else if(score >= 70) {
					gradeStudent[i]="B";
				}
				else if(score >= 65) {
					gradeStudent[i]="C+";
				}
				else if(score >= 60) {
					gradeStudent[i]="C";
				}
				else if(score >= 55) {
					gradeStudent[i]="D+";
				}
				else if(score>=50) {
					gradeStudent[i]="D";
				}
				else {
					gradeStudent[i]="F";
				}
				i++;
			}
			prn.close();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//display
		for(int i=0;i<3;i++) {
			System.out.println(studentID[i]+" "+gradeStudent[i]);
		}
	}

}
