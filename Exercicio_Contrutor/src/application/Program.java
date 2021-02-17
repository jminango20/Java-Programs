package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		/*
		//Instancio o objeto con constructor
		//Product product = new Product(name, price, quantity);
		 */
		
		/*Instancio con Sobrecarga*/
		Product product = new Product(name, price);
		
		/*Instancia con Sobrecarg - Constructor Default*/
		//Product p = new Product();
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		
		/* Encapsulamento Exemplo*/
		product.setName("Computer");
		System.out.println("Update Produto: " + product.getName());
		product.setPrice(1000.00);
		System.out.println("Update Price: " + product.getPrice());
		
		
		
		System.out.println("CONTINUA");
		/*Continuo o codigo*/
		System.out.print("Enter the number of products to be added in stock: ");
		//quantity = sc.nextInt(); //sin sobrecarga
		int quantity = sc.nextInt(); //con sobrecarga
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}