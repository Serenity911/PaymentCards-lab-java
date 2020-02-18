public class ReportingSoftware {
    private int ccTransactionsNumber;
    private int dcTransactionsNumber;
    private int gcTransactionsNumber;

    public ReportingSoftware() {
        this.ccTransactionsNumber = 0;
        this.dcTransactionsNumber = 0;
        this.gcTransactionsNumber = 0;

    }

    public int getCcTransactionsNumber(){
        return this.ccTransactionsNumber;
    }

    public int getDcTransactionsNumber() {
        return dcTransactionsNumber;
    }

    public int getGcTransactionsNumber() {
        return gcTransactionsNumber;
    }

    public void addTransaction(IChargeable card) {
        if (card.getId() == "Credit Card") {
            this.ccTransactionsNumber ++;
        }
        if (card.getId() == "Debit Card"){
            this.dcTransactionsNumber ++;
        }
        else if (card.getId() == "Gift Card") {
            this.gcTransactionsNumber ++;
        }
    }
}
