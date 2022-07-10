package DST3_Stack;

public class StackString {
	LinkedList_String ls;
	public StackString(){
		ls = new LinkedList_String();
	}
	
	public void push(String x) {
		ls.addFirst(x);
	}
	public String pop() {
		String x = ls.getData(0);
		ls.removeAt(0);
		return x;
	}
	public String top() {
		return ls.getData(0);
	}
	
	public void StackStringData() {
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.getData(i)+"\t");
		}
	}
	
	//test prn size()
	public int size() {
		return ls.size();
	}
}
