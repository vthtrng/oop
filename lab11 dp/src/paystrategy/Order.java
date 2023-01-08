package paystrategy;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void processOrder (PayStrategy payStrategy) {
        payStrategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
