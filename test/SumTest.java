import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void testSumPlusMoney(){
        Expression fiveBucks= Money.dollar(5);
        Expression tenFrancs= Money.franc(10);
        Bank bank= new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum= new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
        Money result= bank.reduce(sum, "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testSumTimes(){
        Expression fiveBucks = Money.dollar(5);
        Expression tenFranks = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF","USD", 2);
        Expression sum = new Sum(fiveBucks,tenFranks).times(2);
        Money result = bank.reduce(sum,"USD");
        assertEquals(Money.dollar(20),result);
    }

}