package main;

public class SearchingAndSorting {

	public static void main(String[] args) {
		
		int[] unsorted = {5,8,4,1,9,12,7,21,2};
		
		//BubbleSort(unsorted);
		//InsertionSort(unsorted);
		QuickSort(unsorted,0,(unsorted.length - 1));
		
		System.out.println("QuickSort");
		for(int i = 0; i < unsorted.length; i++) {
			System.out.println(unsorted[i]);
		}
		System.out.println("---------------");
		
	}
	
	public static void BubbleSort(int[] unsortedArray) {
		
		int[] unsorted = unsortedArray;
		int length = unsorted.length;
		int temp = 0;
		
		for (int i=0; i< length ;i++) {
			for (int j=1; j < (length-i); j++) {
				
				if(unsorted[j-1] > unsorted[j]) {
					temp = unsorted[j-1];
					unsorted[j-1] = unsorted[j];
					unsorted[j] = temp;
				}
			}
		}
		
		System.out.println("BubbleSort");
		for(int i = 0; i < length; i++) {
			System.out.println(unsorted[i]);
		}
		System.out.println("---------------");
	}
	
	public static void InsertionSort(int[] unsortedArray) {
		
		int[] unsorted = unsortedArray;
		int length = unsorted.length;
		
		for(int j = 1; j < length; j++) {
			int key = unsorted[j];
			int i = j-1;
			
			while((i > -1) && (unsorted[i] > key)) {
				unsorted[i+1] = unsorted[i];
				i--;
			}
			unsorted[i+1] = key;
		}
		
		System.out.println("InsertionSort");
		for(int i = 0; i < length; i++) {
			System.out.println(unsorted[i]);
		}
		System.out.println("---------------");
		
	}
	
	public static void QuickSort(int array[],int start, int end) {
		
		if (start < end) {
			int p = partition(array,start,end);
			QuickSort(array,start,p-1);
			QuickSort(array,p+1,end);
		}
				
	}
	
	static int partition(int array[],int start,int end) {
		
		int pivot = array[end];
		int i = start - 1;
		
		for(int j = start; j <= end-1; j++) {
			
			if(array[j] < pivot) {
				i++;
				int t = array[i];
				array[i] = array[j];
				array[j] = t;
			}
		}
		
		int t = array[i+1];
		array[i+1] = array[end];
		array[end] = t;
		return (i+1);
				
	}
	
	
}
