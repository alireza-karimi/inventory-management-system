
public class Main {
	
	public static void main(String[] args){
		
		FinancialSystem newFinancialSystem = new FinancialSystem();
		
		newFinancialSystem.addProductionLine("LineA", "bread", 1000);
		newFinancialSystem.addProductionLine("LineB", "chocolate", 1000);
		newFinancialSystem.addProductionLine("LineB", "chocolate", 1000);
		newFinancialSystem.addProductToStore("farmandChocolate", 5000, 10);
		newFinancialSystem.addProductToStore("farmandChocolate", 5000, 5);
		newFinancialSystem.addProductToStore("loplop", 2000, 7);
		newFinancialSystem.printAllProductionLines();
		newFinancialSystem.printAllStorageProducts();
		newFinancialSystem.printValueOfStore();
		
		newFinancialSystem.removeProductionLine("LineA");
		newFinancialSystem.removeProductFromStore("farmandChocolate", 2);
		newFinancialSystem.printAllProductionLines();
		newFinancialSystem.printAllStorageProducts();
		newFinancialSystem.printValueOfStore();

	}
	
}
