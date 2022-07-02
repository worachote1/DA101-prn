package DST0_BigO_Sort;

import java.util.Arrays;

public class My_QuickSort {

	public static void quickSort(int a[], int lowIndex, int hightIndex) {
		
		if(!(lowIndex<hightIndex)) {
			return;
		}
		
		int pivot = a[hightIndex];
		int leftPointer = lowIndex;
		int rightPointer = hightIndex;
		
		while(!(leftPointer==rightPointer)) {
			while(a[leftPointer]<=pivot && leftPointer<rightPointer) {
				leftPointer++;
			}
			while(a[rightPointer]>=pivot && leftPointer<rightPointer ) {
				rightPointer--;
			}
			
		    if(!(leftPointer==rightPointer)) {
				swap(a, leftPointer, rightPointer);
			}
		}
		swap(a, leftPointer, hightIndex);
		
		quickSort(a, lowIndex, leftPointer-1);
		quickSort(a, leftPointer+1, hightIndex);
	}

	public static void swap(int a[],int index1,int index2) {
		
		int temp = a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,5,44,10};
		long t1, t2;
		
		System.out.println("Before QuickSort : " + Arrays.toString(a));
		t1 = System.currentTimeMillis();
		quickSort(a, 0, a.length - 1);
		t2 = System.currentTimeMillis();
		System.out.println("QuickSort take time : " + (t2 - t1));		
		System.out.println("After QuickSort : " + Arrays.toString(a));
	}

}
