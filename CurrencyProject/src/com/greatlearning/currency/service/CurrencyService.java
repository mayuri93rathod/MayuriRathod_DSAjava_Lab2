package com.greatlearning.currency.service;

public class CurrencyService {
	
	public void noteCount(int[] notes, int amount) {
		// TODO Auto-generated method stub
		
		int[] noteCounter = new int[notes.length];
		
	
		 while(amount > 0) {
			 
			 for(int i=0; i<notes.length; i++) {
				 
				if(amount >= notes[i]) {
					
					noteCounter[i] = amount / notes[i];
					
					amount = amount - noteCounter[i]*notes[i];
					
					if(amount ==0 )
						break;
				}
				 
			 }
			 
			 
		 }//while
		 
		 System.out.println("Your payment approach in order to give min no of notes will be");
		 
		 for(int i=0; i<notes.length; i++) {
			 if(noteCounter[i] != 0)
				 System.out.println(notes[i]+" : "+noteCounter[i]);
		 }
		
		
	}
	

}
