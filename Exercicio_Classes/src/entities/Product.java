package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		double total = quantity*price; 
		return total;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//Rescrevendo metodo defaul
	public String toString() {
		return name 
			+ ", $"
			+ String.format("%.2f", price) 
			+ ", "
			+ quantity
			+ " units, Total: $"
			+ String.format("%.2f", TotalValueInStock());
				
				
	}
	
	
	
}
