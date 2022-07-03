package DST1_ArrayList;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class MyArrayList_forGUI<T> {

	private T data[];
	private int size;
	
	public MyArrayList_forGUI() {
		this.size = 0;
		this.data = (T[]) (new Object[10]);
	}
	
	public void add(T x) {
		if(size >= data.length) {
			T data2[] = (T[]) (new Object[this.data.length*2]);
			for(int i=0;i<this.data.length;i++) {
				//clone old data
				data2[i]=this.data[i];
			}
			data = data2;
		}
		
		data[size++]=x;
		
	}
	
	public T get(int index) {
		if(index<0 || index>=size) {
			throw new InvalidParameterException("index out of range : "+index);
		}
		return data[index];
	}
	
	public void set(T x,int index) {
		if(index<0 || index>=size) {
			throw  new InvalidParameterException("index out of range : "+index);
		}
		
		data[index] = x;
	}
	
	public T[] toArray() {
		T x[] = (T[])(new Object[this.size]);
		for(int i=0;i<size;i++) {
			x[i]=data[i];
		}
		return x;
	}
	
	public String toString() {
		T x[] = toArray();
		return Arrays.toString(x);
	}
	
	public int getSize() {
		return size;
	}
	
	public void removeAt(int index) {
		if(index<0 || index>=size) {
			throw  new InvalidParameterException("index out of range : "+index);
		}
		
		//shift index and cut the last
		for(int i=index;i<size-1;i++) {
			data[i]=data[i+1];
		}
		size--;
	}
}
