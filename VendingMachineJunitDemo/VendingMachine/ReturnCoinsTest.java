package VendingMachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReturnCoinsTest {

	@Test
	public void machineReturnsCoin() {
		
		VendingMachine machine = new VendingMachine();

		machine.insertCoin(Coins.Nickel);
			
		Coins coins = machine.returnMoney();

		assertEquals(machine.readCredit(), 0);
		assertEquals(coins,Coins.Nickel);
	}

}
