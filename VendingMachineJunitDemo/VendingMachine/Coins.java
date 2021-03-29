package VendingMachine;


public enum Coins {

	Penny(1), 
	Nickel(5), 
	Dime(10), 
	Quarter(25),
	Nothing(0);
	
	private int value;

	private Coins(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
