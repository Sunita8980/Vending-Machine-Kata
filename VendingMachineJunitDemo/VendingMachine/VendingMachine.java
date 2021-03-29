package VendingMachine;

import java.util.*;
import java.util.stream.Collectors;

public class VendingMachine {
	
	private int credit = 0;
	private int change = 0;
	private int price = 0;
	
	/**
	 * @return the credit value.
	 */
	public int readCredit() {
		return this.credit;
	}
	
	/**
	 * @return the updated price.
	 */
	public int readUpdatedPrice() {
		return this.price;
	}
	

	/**
	 * Inserts a coin adding to credit.
	 */
	public void insertCoin(Coins coin) {
		this.change += coin.getValue();
		this.credit += coin.getValue();
	}

	
	public int purchase(Product product) {
		
		if (credit < product.getPrice()) {
			System.out.println("Insuffiecient credit !!!");
		}
		else if(product.name().equals(Product.OutOfStock.name())){
			System.out.println("Sold Out !!!");
		}
		else{
			System.out.println("Despensing... "+product.name());
			credit -= product.getPrice();
			this.change = 0;
			
			if(credit > 0) { change += credit;
			System.out.println("Despensing change.."+change);
			}
		}
		return change;
	}

	/**
	 * returns the change.
	 */
	public int returnChange() {
		return this.change;
	}
	
	/**
	 * returns the change.
	 */
	public String showExactChange(Product product) {
		
		price = product.getPrice();
		String exactChng = "";
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int penny = 0;
		
		while (price > 0) {
			
			if(price >= 25) { 
				quarters = (int)(price/25);  
				exactChng = exactChng + quarters + " Quarters, "; 
				price -= quarters*25;
			}
			else if(price >= 10) {
				dimes = (int)(price/10);  
				exactChng = exactChng + dimes + " Dimes, "; 
				price -= dimes*10;
			}
			else if(price >= 5) {
				nickels = (int)(price/5);  
				exactChng = exactChng + nickels + " Nickels, "; 
				price -= dimes*5;
			}
			else if(price >= 1) {
				penny = (int)(price/1);  
				exactChng = exactChng + penny + " Pennys, "; 
				price -= penny*5;
			}
		}
		return exactChng;
	}

	public Coins returnMoney() {
		
		Coins coin = Coins.Nothing;
				
		while(credit > 0){
			
			switch(credit) {
				
				case 1:{
					coin = Coins.Penny;
					credit -= coin.getValue();
					break;
				}
				case 5:{
					coin = Coins.Nickel;
					credit -= coin.getValue();
					break;
				}
				case 10:{
					coin = Coins.Dime;
					credit -= coin.getValue();
					break;
				}
				case 25:{
					coin = Coins.Quarter;
					credit -= coin.getValue();
					break;
				}
			}
		}
		return coin;
	}
	 
}
