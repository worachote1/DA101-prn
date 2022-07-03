package DST1_ArrayList;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class MyArrayList {

	private int data[];
	private int size;
	
	public MyArrayList() {
		this.size = 0;
		this.data = new int [10];
	}
	
	public void add(int x) {
		if(size >= data.length) {
			int data2[] = new int[this.data.length*2];
			for(int i=0;i<this.data.length;i++) {
				data2[i]=this.data[i];
			}
			data = data2;
		}
		
		data[size++]=x;
		
	}
	
	public int get(int index) {
		if(index<0 || index>=size) {
			throw new InvalidParameterException("index out of range : "+index);
		}
		return data[index];
	}
	
	public void set(int x,int index) {
		if(index<0 || index>=size) {
			throw  new InvalidParameterException("index out of range : "+index);
		}
		
		data[index] = x;
	}
	
	public int[] toArray() {
		int x[] = new int [this.size];
		for(int i=0;i<size;i++) {
			x[i]=data[i];
		}
		return x;
	}
	
	public String toString() {
		int x[] = toArray();
		return Arrays.toString(x);
	}
	
	public void display_arrayLenght() {
		System.out.println("Array lenght = "+this.data.length);
	}
}
