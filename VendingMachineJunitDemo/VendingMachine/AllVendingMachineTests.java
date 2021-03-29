package VendingMachine;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BuyProductAndGetChangeTest.class, GetMoneyChangeTest.class, ReturnCoinsTest.class,
		SelectProductTest.class })
public class AllVendingMachineTests {

}
