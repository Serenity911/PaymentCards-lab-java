public class GiftCard implements IChargeable{
    private String id;

    public GiftCard() {
        this.id = "Gift Card";
    }

    public String getId() {
        return id;
    }

    public int charge(int amount) {
        return amount;
    }
}
