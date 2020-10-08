/**
 * Product class
 * it represents a product with a name and a price
 * @author alireza karimi
 * @version 1.0.0
 */
public class Product {
	private String name;
	private double price;
	
	/**
	 * Product class constructor
	 * @param name name of product
	 * @param price price of product
	 */
	public Product(String name, double price){
		this.name = new String(name);
		this.price = price;
	}
	
	/**
	 * getter method for name of product
	 * @return name of product
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * getter method for price of product
	 * @return price of product
	 */
	public double getPrice(){
		return price;
	}
}
