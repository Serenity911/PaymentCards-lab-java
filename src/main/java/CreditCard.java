public class CreditCard extends PaymentCard{
    private double riskMultiplier;

    public CreditCard(double fixedPercentage, double riskMultiplier) {
        super(fixedPercentage,"Credit Card");
        this.riskMultiplier = riskMultiplier;
    }

    public double getRiskMultiplier() {
        return riskMultiplier;
    }


    public int charge(int amount){
        double amountFixedPercentage = amount * this.fixedPercentage;
        double amountRiskMultiplier = amount * riskMultiplier;
        return amount += amountFixedPercentage + amountRiskMultiplier;
    }

}
