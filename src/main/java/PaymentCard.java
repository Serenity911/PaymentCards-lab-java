public abstract class PaymentCard implements IChargeable{
    protected double fixedPercentage;
    protected String id;

    public PaymentCard(double fixedPercentage, String id) {
        this.fixedPercentage = fixedPercentage;
        this.id = id;
    }

    public double getFixedPercentage() {
        return fixedPercentage;
    }



    public String getId() {
        return id;
    }
}
