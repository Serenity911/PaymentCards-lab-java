import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    public CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(0.03, 0.2);
    }

    @Test
    public void hasFixedPercentage(){
        assertEquals(0.03, creditCard.getFixedPercentage(), 0.01);
    }

    @Test
    public void hasRiskMultiplier(){
        assertEquals(0.2, creditCard.getRiskMultiplier(), 0.01);
    }

    @Test
    public void hasAnID(){
        assertEquals("Credit Card", creditCard.getId());
    }

    @Test
    public void canCharge(){
        assertEquals(123, creditCard.charge(100), 0.01);
    }
}
