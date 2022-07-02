package DST0_BigO_Sort;

import java.util.Arrays;

public class Sorting {

	public static void bubble(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void selection(int a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			int max = Integer.MIN_VALUE;
			int max_index = 0;
			int last = a.length - 1 - i;
			// Find max index
			for (int j = 0; j <= last; j++) {
				if (max < a[j]) {
					max = a[j];
					max_index = j;
				}
			}
			// then swap
			int temp = a[last];
			a[last] = a[max_index];
			a[max_index] = temp;
		}
	}

	public static void insertion(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int current = a[i];
			int j = i - 1;
			while (j >= 0 && current < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = current;
		}
	}

	public static void merge_sort(int arr[], int left, int right) {
		if (left == right)
			return;

		else {
			if (left < right) {
				int mid = (left + right) / 2;
				merge_sort(arr, left, mid);
				merge_sort(arr, mid + 1, right);

				// Merge
				// for comparison , sorting and merging

				// temp arrays
				int temp[] = new int[arr.length];
				// index of temp arrays
				int temp_index = left;
				// left-sub arrays starter index
				int left_index = left;
				// right-sub arrays starter index
				int right_index = mid + 1;

				// merge the left and right subarrays
				while (left_index <= mid && right_index <= right) {
					if (arr[left_index] < arr[right_index]) {
						temp[temp_index++] = arr[left_index++];
						// temp_index++;
						// left_index++;
					} else if (arr[right_index] < arr[left_index]) {
						temp[temp_index++] = arr[right_index++];
						// temp_index++;
						// right_index++;
					}
				}

				// merge for remaining either sub-left or sub-right
				while (left_index <= mid) {

					temp[temp_index++] = arr[left_index++];
					// temp_index++;
					// left_index++;
				}
				while (right_index <= right) {

					temp[temp_index++] = arr[right_index++];
					// temp_index++;
					// right_index++;

				}

				// Finally , clone temp into arr
				for (int i = left; i <= right; i++) {
					arr[i] = temp[i];
				}
			}
		}

	}

	public static void quickSort(int a[], int lowIndex, int hightIndex) {
		
		if(lowIndex >= hightIndex) {
			return;
		}
		
		int pivot = a[hightIndex]; // i chose the last element as pivot
		int leftPointer = lowIndex;
		int rightPointer = hightIndex;
		
		//keep moving left and right pointer toward each other 
		//then swap until those pointer meet each other
		//After that , swap pivot with the point that those pointer meet each other
		while(leftPointer<rightPointer) {
			while(a[leftPointer]<=pivot && leftPointer<rightPointer) {
				leftPointer++;
			}
			while(a[rightPointer]>=pivot && leftPointer<rightPointer) {
				rightPointer--;
			}		
			
			swap(a,leftPointer,rightPointer);
		}
		
		swap(a, leftPointer, hightIndex);
		//the partition step done here
		//all left element < pivot and all right element > pivot
		
		//recursive step
		//recursive the left side and the right side of pivot
		
		//left
		quickSort(a, lowIndex, leftPointer-1);
		//right
		quickSort(a, leftPointer+1, hightIndex);
	}

	public static void swap(int a[],int index1,int index2) {
		
		int temp = a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
		
	}
	public static void main(String[] args) {

		int a[] = new int[100];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * a.length - a.length / 2);
		}
		long t1, t2;

//		System.out.println("Before bubble : "+Arrays.toString(a));
//		bubble(a);
//		System.out.println("After bubble : "+Arrays.toString(a));

//		System.out.println("Before selection : "+Arrays.toString(a));
//		selection(a);
//		System.out.println("After selection : "+Arrays.toString(a));

//		System.out.println("Before insertion : "+Arrays.toString(a));
//		t1 = System.currentTimeMillis();
//	    insertion(a);
//		t2 = System.currentTimeMillis();
//		System.out.println("After insertion : "+Arrays.toString(a));
//		System.out.println("insertion sort take time : "+(t2-t1));

//		System.out.println("Before mergeSort : " + Arrays.toString(a));
//		t1 = System.currentTimeMillis();
//		merge_sort(a, 0, a.length - 1);
//		
//		System.out.println("After mergeSort : " + Arrays.toString(a));
//		t2 = System.currentTimeMillis();
//		System.out.println("mergeSort take time : " + (t2 - t1));

		System.out.println("Before QuickSort : " + Arrays.toString(a));
		t1 = System.currentTimeMillis();
		quickSort(a, 0, a.length - 1);
		t2 = System.currentTimeMillis();
		System.out.println("QuickSort take time : " + (t2 - t1));		
		System.out.println("After QuickSort : " + Arrays.toString(a));
	}
}
