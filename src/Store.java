import java.util.*;

/**
 * Store class
 * this will represents our company store with an ArrayList of products and
 * a list of product amounts
 * @author alireza karimi
 * @version 1.0.0
 */
public class Store {
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<Integer> amounts = new ArrayList<Integer>();
	
	/**
	 * adding a product to store
	 * @param name name of product
	 * @param price price of product
	 * @param amount amount of product
	 */
	public void addProduct(String name, double price, int amount){
		Product newProduct = new Product(name, price);
		int flag = 0;
		for(int i = 0; i < products.size(); i++){
			if(products.get(i).getName().equals(name) && products.get(i).getPrice() == price){
				amounts.set(i, amounts.get(i) + amount);  
				flag++;
			}
		}
		
		if(flag == 0){
			products.add(newProduct);
			amounts.add(amount);
		}
		
	}
	
	/**
	 * removing some amount of products from the store
	 * @param name name of product
	 * @param amount amount of product
	 */
	public void removeProduct(String name, int amount){
		int initialAmount;
		for(int i = 0; i < products.size(); i++){
			if(products.get(i).getName().equals(name)){
				if(amounts.get(i) > amount){
					initialAmount = amounts.get(i);
					amounts.set(i, initialAmount - amount);
				}
				else{
					//removing the product and its amount
					products.remove(i);
					amounts.remove(i);
				}
			}
		}
	}
	
	/**
	 * calculating the store total value
	 * @return value of all store products
	 */
	public double calcValue(){
		double sum = 0;
		
		for(int i = 0; i < products.size(); i++){
			sum += products.get(i).getPrice() * amounts.get(i);
		}
		
		return sum;
	}
	
	/**
	 * prints all store products and their amounts
	 */
	public void print(){
		for(int i = 0; i < products.size(); i++){
			System.out.printf("ProductName: %s | Quantity: %d", products.get(i).getName(), amounts.get(i));
			System.out.println();
		}
	}
}
