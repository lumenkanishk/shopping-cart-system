public class FestiveDiscount implements Discount {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.9;
    }
}