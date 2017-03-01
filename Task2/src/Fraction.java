
public class Fraction {

	private int denominator;
	private int numerator;

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		reduceFraction();
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	private void reduceFraction() {

		int nod;

		if (Math.abs(numerator) < Math.abs(denominator)) {
			nod = Math.abs(numerator);
		} else {
			nod = Math.abs(denominator);
		}
		while (true) {
			if (((numerator % nod) == 0) && ((denominator % nod) == 0))
				break;
			nod--;
		}
		numerator = numerator / nod;
		denominator = denominator / nod;

	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;

	}

}
