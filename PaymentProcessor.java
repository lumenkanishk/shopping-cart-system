public class PaymentProcessor implements Payment {
    @Override
    public void pay(double amount) {
        // The payment processing logic - in this case, just displays the final amount
        System.out.printf("Total Amount Payable: %.2f\n", amount);
    }
}