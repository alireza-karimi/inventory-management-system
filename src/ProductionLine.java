/**
 * ProductionLine class
 * it represents a ProductionLine with a name and the product it is making
 * @author alireza karimi
 * @version 1.0.0
 */
public class ProductionLine {
	private String name;
	private Product type;
	
	/**
	 * ProductionLine constructor
	 * @param name name of ProductionLine
	 * @param type Product object which this line creates
	 */
	public ProductionLine(String name, Product type){
		this.name = name;
		this.type = new Product(type.getName(), type.getPrice());
	}
	
	/**
	 * getter method for name of peoductionLine
	 * @return name of productionLine
	 */
	public String getName(){
		return name;
	}
	
	public Product getType(){
		return type;
	}
	
	/**
	 * prints name of ProductionLine and the product that it makes
	 */
	public void print(){
		System.out.printf("Name: %s | Product: %s", name, type.getName());
		System.out.println();
	}
}
