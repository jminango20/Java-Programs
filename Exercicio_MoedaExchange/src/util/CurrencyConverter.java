package util;

public class CurrencyConverter {
	
	public static final double IOF =  0.06;
	
	public static double cambio(double real, double dollarPrice) {
		return real * dollarPrice * (1.0 + IOF);
	}
	

}
