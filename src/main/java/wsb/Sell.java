package wsb;

public class Sell {
    private double value;
    private double quantity;

    public Sell(double value, double quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    public double getAmount() {
        return value;
    }

    public void setAmount(double amount) {
        this.value = amount;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "quantity: " + quantity + ", value: " + value;
    }
}

