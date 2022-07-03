package DST0_BigO_Sort;

import java.util.Arrays;
import java.util.Random;

public class My_QuickSort {

	public static void quickSort(double a[],int lowIndex,int highIndex) {
		
		if(lowIndex>=highIndex) {
			return;
		}
		
		Random rand = new Random();
		int pivot_index = rand.nextInt(highIndex-lowIndex)+lowIndex;
		double pivot = a[pivot_index];
		//swap random pivot with highIndex
		swap(a, pivot_index, highIndex);
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(!(leftPointer==rightPointer)) {
			
			//shift leftPointer to the number that > pivot
			while(a[leftPointer]<=pivot && !(leftPointer==rightPointer)) {
				leftPointer++;
			}
			//shift rightPointer to the number that < pivot
			while(a[rightPointer]>=pivot && !(leftPointer==rightPointer)) {
				rightPointer--;
			}
			
			//after end with shift left and right pointer
			//swap each other
			swap(a, leftPointer, rightPointer);
		}
		
		//swap pivot(which now at hightIndex) with number that have both left and right pointer(at leftPointer or right Pointer index)
		swap(a, leftPointer,highIndex);
		
		//now left side of pivot are < 
		//and right side of pivot are >
		
		//recursive quick sort left side and right side
		
		//left side recursive
		quickSort(a, lowIndex, leftPointer-1);
		//right side recursive
		quickSort(a, leftPointer+1, highIndex);
	}
	public static void swap(double a[],int index1,int index2) {
		double temp = a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		double a[] =new double[4444444]; //{20.66,20,44,20.44};
		for(int i=0;i<a.length;i++) {
			a[i] = rand.nextDouble()*100;
		}
		long t1, t2;
		
		//System.out.println("Before QuickSort : " + Arrays.toString(a));
		t1 = System.currentTimeMillis();
		quickSort(a, 0, a.length - 1);
		t2 = System.currentTimeMillis();
		//System.out.println("After QuickSort : " + Arrays.toString(a));
		System.out.println("QuickSort take time : " + (t2 - t1));		
	}

}
