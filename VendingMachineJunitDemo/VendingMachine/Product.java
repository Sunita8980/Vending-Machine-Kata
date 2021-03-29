package VendingMachine;

public enum Product {
	
	Cola(100), 
	Chips(50), 
	Candy(65), 
	Water(55),
	OutOfStock(0); 
    
    private final int price;

    private Product(int price) {
        this.price = price;
    }

	public int getPrice() {
        return price;
    }

}
