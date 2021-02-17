package application;

import java.util.Scanner;

public class Program {

	public static final double PI = 3.1415;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		double c = circunference(radius);
		double v = volume(radius);
		
		System.out.printf("Cricumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI Value: %.2f\n", PI);
		
		sc.close();

	}

	public static double circunference(double radius) {
		return 2.0*PI*radius;
	}
	
	public static double volume(double radius) {
		return 4.0*PI*radius*radius/3.0;
	}
	
	
}
