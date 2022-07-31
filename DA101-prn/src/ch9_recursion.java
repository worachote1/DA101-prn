
public class ch9_recursion {

	public static void main(String[] args) {
		
		String c[] = {"G","R","B"};
		int count = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if((c[i].equals("G") && c[j].equals("G")) 
							|| (c[j].equals("G") && c[k].equals("G"))) {
						continue;
					}
					System.out.println(c[i]+""+c[j]+c[k]);
					count++;
				}
				//System.out.println("p");
			}
			//System.out.println();
		}
		//System.out.println("count = "+count);
		System.out.println(count);
	}

}
