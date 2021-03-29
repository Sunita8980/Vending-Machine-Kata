package VendingMachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetMoneyChangeTest {

	@Test
	public void displayCorrectChangeForProduct() {
		
		VendingMachine machine = new VendingMachine();
		
		machine.showExactChange(Product.Candy);

		assertEquals(machine.readUpdatedPrice(), 0);
	}

}
