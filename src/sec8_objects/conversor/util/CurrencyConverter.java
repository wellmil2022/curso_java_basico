package sec8_objects.conversor.util;

public class CurrencyConverter {
	public static double iof = 0.06f;
	
	public static double Converter(double valueDolar, double quantDolar) {
		double tax = valueDolar * iof;
		return quantDolar * (valueDolar + tax);
	}
	
}
