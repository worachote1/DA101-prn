package DST1_ArrayList;

public class MyArrayListTest {

	public static void main(String[] args) {
		
		MyArrayList l = new MyArrayList();
		for(int i=0;i<15;i++) {
			l.add((int)(Math.random()*100));
		}
		l.display_arrayLenght();
		System.out.println(l);
		l.set(44, 1);
		System.out.println(l);
		System.out.println(l.get(3));
	}

}
