package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//double xA, xB, xC, yA, yB, yC;
		
		//Declaracion Nueva Classe
		Triangulo x,y;
		//Instancia Classe
		x = new Triangulo();
		y = new Triangulo();
				
		
		System.out.println("Enter the measures of triangle X: ");
		//xA = sc.nextDouble();
		x.a = sc.nextDouble();
		//xB = sc.nextDouble();
		x.b = sc.nextDouble();
		//xC = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		//yA = sc.nextDouble();
		y.a = sc.nextDouble();		
		//yB = sc.nextDouble();
		y.b = sc.nextDouble();
		//yC = sc.nextDouble();
		y.c = sc.nextDouble();

		//double p = (xA + xB + xC) / 2.0;
		//double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		//p = (yA + yB + yC) / 2.0;
		//double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		//Com objeto de classe
		//double p = (x.a + x.b + x.c) / 2.0;
		//double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		//p = (y.a + y.b + y.c) / 2.0;
		//double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		//Metodo da class Triangulo
		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}