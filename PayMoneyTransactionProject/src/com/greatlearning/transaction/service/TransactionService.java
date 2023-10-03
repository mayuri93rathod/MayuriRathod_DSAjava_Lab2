package com.greatlearning.transaction.service;

import java.util.Scanner;

public class TransactionService {

	public void checkTransaction(int[] array, int noTarget) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(noTarget !=0) {
		
			System.out.println("enter the value of target"); 
			int valTarget= sc.nextInt();
			
			int sum =0;
			int flag =0;
		
				for(int i=0; i<array.length; i++) {
					
					sum += array[i];
					
					if(valTarget <= sum) {
						System.out.println("Target achieved after "+ (i+1) +" transactions");
						flag=1; //target achieved
						break;
					}
					
				}//for
				
				if(flag == 0) {
					System.out.println("Given target is not achieved\n");
				}
		
				noTarget --;
				
		}//while
		
		
		
	}
	
	
}
