import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReportingSoftwareTest {
    public ReportingSoftware reportingSoftware;
    public IChargeable cCard;
    public IChargeable dCard;
    public IChargeable gCard;


    @Before
    public void before(){
        reportingSoftware = new ReportingSoftware();
        cCard = new CreditCard(0.03, 0.2);
        dCard = new DebitCard(0.02);
        gCard = new GiftCard();
    }

    @Test
    public void countCCTransactionStartsAt0() {
        assertEquals(0, reportingSoftware.getCcTransactionsNumber());
    }

    @Test
    public void countDCTransactionStartsAt0() {
        assertEquals(0, reportingSoftware.getDcTransactionsNumber());
    }

    @Test
    public void countGCTransactionStartsAt0() {
        assertEquals(0, reportingSoftware.getGcTransactionsNumber());
    }

    @Test
    public void canIncreaseCCnumber(){
        reportingSoftware.addTransaction(cCard);
        assertEquals(1, reportingSoftware.getCcTransactionsNumber());
        assertEquals(0, reportingSoftware.getDcTransactionsNumber());
        assertEquals(0, reportingSoftware.getGcTransactionsNumber());


    }

    @Test
    public void canIncreaseDCnumber(){
        reportingSoftware.addTransaction(dCard);
        assertEquals(0, reportingSoftware.getCcTransactionsNumber());
        assertEquals(1, reportingSoftware.getDcTransactionsNumber());
        assertEquals(0, reportingSoftware.getGcTransactionsNumber());


    }

    @Test
    public void canIncreaseGCnumber(){
        reportingSoftware.addTransaction(gCard);
        assertEquals(0, reportingSoftware.getCcTransactionsNumber());
        assertEquals(0, reportingSoftware.getDcTransactionsNumber());
        assertEquals(1, reportingSoftware.getGcTransactionsNumber());


    }

}
