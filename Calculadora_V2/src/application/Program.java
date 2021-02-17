package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		//c1.radius = sc.nextDouble();	
		double radius = sc.nextDouble();
		double c = c1.circunference(radius);
		double v = c1.volume(radius);
		
		System.out.printf("Cricumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI Value: %.2f\n", c1.PI);
		
		sc.close();

	}

}
