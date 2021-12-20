package com.greatlearning.service;

public class NotesCount {
	public void notesCountImplementation(int[] notes, int amount) {
		int count[] = new int[notes.length];
		try {
			while(amount != 0) {
				for(int i=0; i< notes.length; i++) {
					count[i] += (amount/notes[i]);
					amount = amount - count[i]* notes[i];
				}
				if(amount > 0) {
					System.out.println("Exact amount cannot be given with the highest denomination");
					break;
				}
				else {
					System.out.println("Your payment approach in order to give min no of notes will be ");
					for(int i =0; i< notes.length; i++)
					{	
						if (count[i] > 0) {
							System.out.println(notes[i]+":  "+count[i]);
						}
					}
				}
			}
		}
		catch (ArithmeticException e) {
			System.out.println(e+ " notes of denomination 0 is invalid");
		}
	}
}
