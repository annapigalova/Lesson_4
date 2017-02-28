
public class Fraction {

	private int denominator;
	private int numerator;
	private String fraction;


	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public String getFraction() {
		return fraction;
	}

	public String setFraction(int numerator, int denominator) {
		
		this.fraction = reduceFraction();
		return this.fraction;
	}

	private String reduceFraction() {

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
		return numerator + "/" + denominator;

	}

}
