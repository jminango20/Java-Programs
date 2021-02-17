package entities;

public class Product {
	
	//public String name;
	//public double price;
	//public int quantity;
	
	//Encapsulamento
	private String name;
	private double price;
	private int quantity;

	
	
	//Constructor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Sobrecarga Default
	public Product() {
		
	}
	
	
	/*ENCAPSULAMENTO*/
	//Name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	//Price
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	//Quantity -> Depende Modelo Negocio.. Al inicio de la ejecucion no puedo alterar cantidad.
	public int getQuantity() {
		return quantity;
	}
	
	
	
	//Metodos de total ; add; remove
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}