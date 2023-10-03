package com.greatlearning.currency.sorting;

public class MergeSort {

	
	public void mergeSorting(int[] notes, int left, int right) {
		// TODO Auto-generated method stub
		
		int mid;
        if(left < right)
        {
            mid = (left + right) / 2;

            // recursive calls to sort first half and second half sub-arrays
            mergeSorting(notes, left, mid);
            mergeSorting(notes, mid+1, right);
            merge(notes, left, mid, right);
        }
		
		
	}//
	
	
	// after sorting this function merge the array
    static void merge(int[] arr, int left, int middle, int right)
    {
    	int size1 = middle - left + 1;
        int size2 = right - middle;
        
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < size1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < size2; j++)
            rightArray[j] = arr[middle + 1 + j];
        
        // Initial indices of left and right sub-arrays
        int i = 0, j = 0;
        
        // Initial index of merged sub-array
        int k = left;
        while (i < size1 && j < size2) {
            // Descending order condition
            if (leftArray[i] >= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of leftArray
        while (i < size1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of rightArray
        while (j < size2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
	
	
}
