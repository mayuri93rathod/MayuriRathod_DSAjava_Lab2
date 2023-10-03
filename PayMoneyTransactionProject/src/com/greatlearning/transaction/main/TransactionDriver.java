package com.greatlearning.transaction.main;

import java.util.Scanner;

import com.greatlearning.transaction.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the size of transaction array"); 
		int tranSize= sc.nextInt();
		
		System.out.println("enter the values of array"); 
		int[] array = new int[tranSize];
		
		for(int i=0; i<tranSize; i++) { //accepting array values
			
			array[i] = sc.nextInt();
			
		}
		
		System.out.println("enter the total no of targets that needs to be achieved"); 
		int noTarget = sc.nextInt();
						
		TransactionService tranService = new TransactionService();
		tranService.checkTransaction(array,noTarget);
		
		sc.close();
	}

}
