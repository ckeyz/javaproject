public class Product {
	private String name;
	private int stockLevel;
	private double price;
	
	public Product(String nme, int stkLvl, double prc){
		name = nme;
		stockLevel = stkLvl;
		price = prc;
	}
	
	public int reStock(int stk){
		stockLevel = stockLevel + stk;
		return stockLevel;
	}
	
	public double sell(int sold){
		if(sold > stockLevel){
			return 0.0;
		}else{
			price = sold * price;
			return price;
		}
	}
	
	public void setPrice(double stPrc){
		price = stPrc;
	}
	
	public String getName(){
		return name;
	}
	
	public int getStockLevel(){
		return stockLevel;
	}
	
	public double getPrice(){
		return price;
	}
}
