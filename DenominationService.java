package nitin_FOPJava_LabAlgo2;


public class DenominationService {
	public void notesCountImplementation(int note[], int amount) {

		int[] noteCounter = new int[note.length];
				
		try {
			for (int i = 0; i < note.length; i++) {
				if (amount >= note[i]) {
					noteCounter[i] = amount / note[i]; //10, 0, 1, 0
					amount = amount - noteCounter[i] * note[i]; // 0
					
					if(amount == 0)
						break;
				}
			}
			if (amount > 0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < note.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(note[i] + ":" + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e+ " notes of denomination 0 is invalid");
		}
	}
}
