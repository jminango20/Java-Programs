package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double pagoReal = CurrencyConverter.cambio(amount, dollarPrice);
		System.out.println("Amount to be paid in reais = " + pagoReal);
		
		
		sc.close();

	}

}
