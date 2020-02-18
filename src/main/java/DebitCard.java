public class DebitCard extends PaymentCard {

    public DebitCard(double fixedPercentage) {
        super(fixedPercentage, "Debit Card");
    }

    public int charge(int amount){
        return amount += amount * this.fixedPercentage;
    }
}
