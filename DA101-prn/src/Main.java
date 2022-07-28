import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int id = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		String surname = sc.nextLine();
		String classroom = sc.nextLine();
		int score = Integer.parseInt(sc.nextLine());
		
		/* Student[] s = new Student[10];
		for(int i = 10; i < N; i++)
		{

		} */

		Student s1 = new Student(id,name,surname,classroom,score);
		System.out.println(s1.getGrade());
		
		sc.close();
	}

}
