import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegrationTest {
    @Test
    public void testMixedAddition(){
        Expression fiveBucks = Money.dollar(5);
        Expression tenFranks = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF","USD",2);
        Money result = bank.reduce(fiveBucks.plus(tenFranks),"USD");
        assertEquals(Money.dollar(10),result);
    }
}
