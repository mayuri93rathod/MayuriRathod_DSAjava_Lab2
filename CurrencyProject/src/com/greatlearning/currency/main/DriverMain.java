package com.greatlearning.currency.main;

import java.util.Scanner;

import com.greatlearning.currency.service.CurrencyService;
import com.greatlearning.currency.sorting.MergeSort;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of currency denominations");
		int Count= sc.nextInt();
		
		System.out.println("enter the currency denominations value");
		int[] notes = new int[Count]; 
		
		for(int i=0;i<Count;i++) {
			notes[i]=sc.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		
		//first need to do sorting of notes in descending order
		
		MergeSort mergeSort = new MergeSort();
		
		CurrencyService currencyService = new CurrencyService();
		
		mergeSort.mergeSorting(notes,0,notes.length-1);
		
		currencyService.noteCount(notes,amount);
		
		sc.close();
		
	}

}
