package nitin_FOPJava_LabAlgo2;

import java.util.Scanner;

public class TransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		// getting size of array
		System.out.println("Please enter number of transactions: ");
		int size = in.nextInt();
		System.out.println();
		// forming an array
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter your element:");
			array[i] = in.nextInt();
		}
		System.out.println();
		System.out.println("Please enter total number of targets: ");
		int target = in.nextInt();
		
		TransactionService Service = new TransactionService();
		Service.checkTransaction(array, target);
		
		in.close();
	}
}
