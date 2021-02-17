package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Product producto = new Product();
		
		
		System.out.println("Enter Product Data: ");
		System.out.print("Name: ");
		producto.name = sc.nextLine();
		System.out.print("Price: ");
		producto.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		producto.quantity = sc.nextInt();
		//double total = producto.TotalValueInStock();

		//Resultados
		//System.out.printf("Product data: %s, $ %.2f, %d units, Total: $%.2f\n",producto.name,producto.price,producto.quantity,total);
		
		//Update
		//System.out.print("Enter the number of products to be added in stock: ");
		//int add = sc.nextInt();
		//producto.AddProducts(add);
		//total = producto.TotalValueInStock();
		//System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $%.2f\n",producto.name,producto.price,producto.quantity,total);

		//Remove
		//System.out.print("Enter the number of products to be removed from stock: ");
		//int remove = sc.nextInt();
		//producto.RemoveProducts(remove);
		//total = producto.TotalValueInStock();
		//System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $%.2f\n",producto.name,producto.price,producto.quantity,total);
		
		//RESCREVENDO METODOS PADRAO
		System.out.println("Product data: " + producto);
		//Update
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		producto.AddProducts(quantity);
		System.out.println("Updated data: " + producto);
		//Remove
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		producto.RemoveProducts(quantity);
		System.out.println("Updated data: " + producto);
		
		
		sc.close();
		
	}

}
