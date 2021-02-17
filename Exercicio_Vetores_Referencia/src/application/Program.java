package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Product[] product = new Product[n];
		
		for(int i=0; i<product.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double price = sc.nextDouble();
			//Instanciar el vector product
			product[i] = new Product(nome, price);
		}
		
		double sum=0;
		for(int i=0; i<product.length; i++) {
			sum += product[i].getPrice();
		}
		
		double average = sum/product.length;
		System.out.println("AVERAGE PRICE = " + average);
		
		
		
		
		
		sc.close();

	}

}
