package Entities;

public class Product {
	
	private String Name;
	private Double Price;
	private int Quantity;
	
	public Product(String name, Double price, int quantity) {
		super();
		Name = name;
		Price = price;
		Quantity = quantity;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	public Double getValorTotal() {
		return this.Price*this.Quantity;
	}
	
	
}
