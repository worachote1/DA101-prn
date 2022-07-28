import java.util.Scanner;

public class ch4_BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String ss[] = new String[n];
		for (int i = 0; i < n; i++) {
			ss[i] = sc.nextLine();
		}
		sc.close();
		// test display arr
//		System.out.println("Display before sort : ");
//		for (int i = 0; i < n; i++) {
//			System.out.println(ss[i]);
//		}
//		System.out.println();

		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n-1-i ; j++) {
				if (ss[j].length() > ss[j + 1].length()) {
					count++;
					String temp = ss[j];
					ss[j] = ss[j + 1];
					ss[j + 1] = temp;
				}
				//same length
				else if(ss[j].length() == ss[j + 1].length()) {
					//int k=0;
					for(int k=0;k<ss[j].length();k++) {
						if(ss[j].charAt(k) < ss[j + 1].charAt(k)) {
							break;
						}
						if(ss[j].charAt(k) == ss[j + 1].charAt(k)) {
							continue;
						}
						if(ss[j].charAt(k) > ss[j + 1].charAt(k)) {
							String temp = ss[j];
							ss[j] = ss[j + 1];
							ss[j + 1] = temp;
							count++;
							break;
						}
					}
				}
				
			}
		}

//		System.out.println("After that display before sort dict : ");
//		for (int i = 0; i < n; i++) {
//			System.out.println(ss[i]);
//		}


		// display after sort by length and dictionary order
//		System.out.println();
//		System.out.println("Display after sort dict");
		for (int i = 0; i < n; i++) {
			System.out.println(ss[i]);
		}
		System.out.println(count);
	
	}

	/*
	  5 
	  elephant 
	  dog 
	  cat 
	  bird 
	  ant
	 * 
	 */
}
