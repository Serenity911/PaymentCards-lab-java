import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    public GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard();
    }

    @Test
    public void hasAnID(){
        assertEquals("Gift Card", giftCard.getId());
    }

    @Test
    public void canCharge(){
        assertEquals(100, giftCard.charge(100));
    }
}
