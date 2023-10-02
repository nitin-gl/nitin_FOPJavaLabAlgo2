package nitin_FOPJava_LabAlgo2;

import java.util.Scanner;

public class DenominationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// taking number of denomination notes
		System.out.println("Enter the size of currency denomination");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter note denominations:");
			arr[i] = sc.nextInt();
			}
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		
		mergeSortimplementation CheckSort = new mergeSortimplementation();
		CheckSort.sort(arr, 0, arr.length-1);
		
		DenominationService NoteCount = new DenominationService();
		NoteCount.notesCountImplementation(arr, amount);
		
		sc.close();
	}
}
