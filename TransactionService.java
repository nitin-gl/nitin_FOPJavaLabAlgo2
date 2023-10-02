package nitin_FOPJava_LabAlgo2;

import java.util.Scanner;

public class TransactionService {

	public void checkTransaction(int[] arr, int targetNo) {
		Scanner in = new Scanner(System.in);

		while (targetNo-- != 0) {
			int flag = 0;
			int target;
			System.out.println("Enter value of target");
			target = in.nextInt();

			int sum = 0;

			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transaction");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Target not achieved");
			}
		}

		in.close();
	}
}