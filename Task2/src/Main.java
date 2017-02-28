import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
while (true){
		int k = processInputSize(sc);
		arrayFraction(k, sc);
}
	}

	private static int processInputSize(Scanner sc) {
		int k = 0;
		boolean isInputOK = false;

		System.out.println("Enter array size: ");

		while (!isInputOK) {
			if (sc.hasNextInt()) {
				k = sc.nextInt();
				if (k > 0) {
					isInputOK = true;
				} else {
					System.out.println("Enter positive number. Try again");
				}
			} else {
				System.out.println("Incorrect number. Try again:");
				sc.next();
			}
		}

		return k;
	}

	private static void arrayFraction(int k, Scanner sc) {
		boolean isInputNumOK = false;
		boolean isInputDenOK = false;

		int numerator = 0;
		int denominator = 0;

		String[] arrayFraction = new String[k];
		Fraction fr = new Fraction();

		for (int i = 0; i < arrayFraction.length; i++) {
			while (!isInputNumOK) {

				System.out.print(i + " Enter numerator: ");

				if (sc.hasNextInt()) {
					numerator = sc.nextInt();
					fr.setNumerator(numerator);
					isInputNumOK = true;

				} else {
					System.out.println("Enter correct number");
					sc.next();
				}
			}
			while (!isInputDenOK) {
				System.out.print(i + " Enter denominator: ");
				if (sc.hasNextInt()) {
					denominator = sc.nextInt();
					if (denominator != 0) {
						isInputDenOK = true;
						fr.setDenominator(denominator);
					} else {
						System.out.println("Enter correct number");
					}
				} else {
					System.out.println("Enter correct number");
					sc.next();
				}

			}

			arrayFraction[i] = fr.setFraction(numerator, denominator);

			isInputNumOK = false;
			isInputDenOK = false;

		}

		for (int j = 0; j < arrayFraction.length; j++) {
			if (j > 0) {
				System.out.print(", ");
			}
			System.out.print(arrayFraction[j]);
		}

	}
}
