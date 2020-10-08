import java.util.*;

/**
 * FinancialSystem class
 * @author alireza karimi
 * @version 1.0.0
 */
public class FinancialSystem {
	private ArrayList<ProductionLine> productionLines = new ArrayList<ProductionLine>();
	Store store = new Store();
	
	/**
	 * print all ProductionLine names and the product they make 
	 */
	public void printAllProductionLines(){
		for(ProductionLine line : productionLines){
			line.print();
		}
	}
	
	/**
	 * adding a new line to productionLines
	 * @param name ProductionLine name
	 * @param productName product name of productLine
	 * @param productPrice product price of productLine
	 */
	public void addProductionLine(String name, String productName, double productPrice){
		Product newProduct = new Product(productName, productPrice);
		ProductionLine newProductionLine = new ProductionLine(name, newProduct);
		int flag = 0;
		
		for(int i = 0; i < productionLines.size(); i++){

			if(productionLines.get(i).getName().equals(name) && productionLines.get(i).getType().getName().equals(productName) && productionLines.get(i).getType().getPrice() == productPrice){
				flag++;
				return;
			}
		
		}
		
		if(flag == 0){
			productionLines.add(newProductionLine);
		}

	}
	
	/**
	 * removes a line from productionLines
	 * @param name name of productionLine
	 */
	public void removeProductionLine(String name){
		for(int i = 0; i < productionLines.size(); i++){
			if(productionLines.get(i).getName().equals(name)){
				productionLines.remove(i);
				break;
			}
		}
	}
	
	/**
	 * prints all store products and their amounts
	 */
	public void printAllStorageProducts(){
		store.print();
	}
	
	/**
	 * adding a product to store
	 * @param name product name
	 * @param price product price
	 * @param amount amount of product
	 */
	public void addProductToStore(String name, double price, int amount){
		store.addProduct(name, price, amount);
	}
	
	/**
	 * removing a product form store
	 * @param name name of product
	 * @param amount amount of product
	 */
	public void removeProductFromStore(String name, int amount){
		store.removeProduct(name, amount);
	}
	
	/**
	 * printing total value of store
	 */
	public void printValueOfStore(){
		System.out.println(store.calcValue());
	}
}
