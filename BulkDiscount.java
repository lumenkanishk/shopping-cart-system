public class BulkDiscount implements Discount {
    private int totalQuantity;
    
    public BulkDiscount(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
    
    @Override
    public double applyDiscount(double totalAmount) {
        if (totalQuantity > 5) {
            return totalAmount * 0.8;
        }
        return totalAmount;
    }
}