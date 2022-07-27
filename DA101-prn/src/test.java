import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 6, 4, 5, 69, 12, 2, 11, 9 };
		for(int i=0;i<a.length;i++)
		{
			int min_index = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min_index])
				{
					min_index = j;
				}
			}
			int t = a[i];
			a[i] = a[min_index];
			a[min_index]=t;
		}

		//display
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
