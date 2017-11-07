import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void testReduceSum(){
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney(){
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testReduceMoneyDifferentCurrency(){
        Bank bank = new Bank();
        bank.addRate("CHF","USD",2);
        Money result = bank.reduce(Money.franc(2),"USD");
        assertEquals(Money.dollar(1),result);
    }


    //test się nie załamał ??
    @Test
    public void testArrayEquals(){
        assertEquals(new Object[]{"abc"}, new Object[]{"abc"});
    }

    @Test
    public void testIdentityRate(){
        assertEquals(1, new Bank().rate("USD","USD"));
    }
}