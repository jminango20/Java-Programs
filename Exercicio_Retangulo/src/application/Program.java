package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.println("Resultado: ");
		System.out.println(rectangle);
		
		
		sc.close();
		
	}

}
