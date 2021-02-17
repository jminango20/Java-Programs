package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		//double c = Calculator.circunference(radius);
		//double v = Calculator.volume(radius);

		System.out.printf("Cricumference: %.2f\n", Calculator.circunference(radius));
		System.out.printf("Volume: %.2f\n", Calculator.volume(radius));
		System.out.printf("PI Value: %.2f\n", Calculator.PI);
		
		
		sc.close();

	}

}
