package com.greatlearning.dsa;

import java.util.Scanner;

public class Transaction {
	public static void main(String args[]) {
		int transaction_size;
		int targetno;
		int targetsum = 0;
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		
		//Input Size of array
		System.out.println("Enter the size of the transaction array");
		transaction_size = sc.nextInt();
		int transactionarr[] = new int[transaction_size];
		
		// Input Values of transaction array
		System.out.println("Enter the values of the transaction array");
		for(int i=0; i < transaction_size; i++) {
			transactionarr[i] = sc.nextInt();
		}
		
		// Input Target no achieved 
		System.out.println("Enter the total no. of targets to be achieved");
		targetno = sc.nextInt();
		
		// Target values to be achieved logic
		while(targetno > 0)
		{
			System.out.println("Enter the value of target to be achieved");
			int targetval = sc.nextInt();
			for(int i= 0; i< transaction_size; i++) {
				targetsum = targetsum + transactionarr[i];
				if(targetsum >= targetval ) {
					System.out.println("Target achieved after "+(i+1)+" transactions");
					check = true;
					break;
				}
			}
			targetno --;
		}
		if(!check) {
			System.out.println("Given target is not achieved");
		}
	}
}

