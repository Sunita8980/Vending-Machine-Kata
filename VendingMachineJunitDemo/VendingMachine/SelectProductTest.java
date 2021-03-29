package VendingMachine;

import static org.junit.Assert.*;
import org.junit.*;

public class SelectProductTest {

		
	@Test
	public void selectProductandDeductMoney() {
		
		VendingMachine machine = new VendingMachine();
		
		for (int i = 4; i > 0; i--) {
			machine.insertCoin(Coins.Quarter);
		}
		machine.purchase(Product.Cola);

		assertEquals(machine.readCredit(),Coins.Nothing.getValue());
	}
	
	@Test
	public void NoCreditDeductionIfProductIsOutOfStock() {
		
		VendingMachine machine = new VendingMachine();
		
		for (int i = 3; i > 0; i--) machine.insertCoin(Coins.Quarter);
		machine.purchase(Product.OutOfStock);

		assertEquals(machine.readCredit(), (Coins.Quarter.getValue() * 3));
	}

	@Test
	public void NoProductDispensedIfNotEnoughCoinsInserted() {
		
		VendingMachine machine = new VendingMachine();
		
		machine.insertCoin(Coins.Quarter);
		machine.purchase(Product.Candy);
	
		assertEquals(machine.readCredit(), Coins.Quarter.getValue());
	}

}
