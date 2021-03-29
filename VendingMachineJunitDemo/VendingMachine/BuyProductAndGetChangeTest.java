package VendingMachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuyProductAndGetChangeTest {

	@Test
	public void selectProductandGetChange() {
		
		VendingMachine machine = new VendingMachine();
		
		for (int i = 4; i > 0; i--) {
			machine.insertCoin(Coins.Quarter);
		}
		int change = machine.purchase(Product.Water);

		assertEquals(machine.readCredit(),change);
	}

}
