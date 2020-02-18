import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    public DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard(0.02);
    }

    @Test
    public void hasFixedPercentage(){
        assertEquals(0.02, debitCard.getFixedPercentage(), 0.01);
    }


    @Test
    public void hasAnID(){
        assertEquals("Debit Card", debitCard.getId());
    }

    @Test
    public void canCharge(){
        assertEquals(102, debitCard.charge(100));
    }

}
