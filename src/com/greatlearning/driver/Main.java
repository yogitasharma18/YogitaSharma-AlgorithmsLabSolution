package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;

public class Main {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		
		// Input size of currency denomination array
		System.out.println("Enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		
		// Input value of currency denomination array
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		
		// Input amount to be paid
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		// Merge sort call
		mergeSortImplementation.sort(notes,0,notes.length-1);
		
		// Print sorted array
		System.out.println("Sorted currency denominations array is: ");
		for (int i = 0; i < size; i++) {
			System.out.println(notes[i]);
		}
		
		// Count of notes to be paid
		notesCount.notesCountImplementation(notes, amount);
	}

}
