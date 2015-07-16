package org.javamoney.moneta;

class NumberVerifier {

	private NumberVerifier() {
	}

public static void checkNoInfinityOrNaN(Number number) {
    if (Double.class == number.getClass() || Float.class == number.getClass()) {
        double dValue = number.doubleValue();
        if (Double.isNaN(dValue)) {
            throw new ArithmeticException("Not a valid input: NaN.");
        } else if (Double.isInfinite(dValue)) {
            throw new ArithmeticException("Not a valid input: INFINITY: " + dValue);
        }
    }
}

public static boolean isInfinityAndNotNaN(Number number) {
    if (Double.class == number.getClass() || Float.class == number.getClass()) {
        double dValue = number.doubleValue();
        if (Double.isNaN(dValue)) {
            throw new ArithmeticException("Not a valid input: NaN.");
        } else if (Double.isInfinite(dValue)) {
            return true;
        }
    }
    return false;
}
}
