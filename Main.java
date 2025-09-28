import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        try {
            int numberOfProducts = scanner.nextInt();
            
            for (int i = 0; i < numberOfProducts; i++) {
                String name = scanner.next();
                double price = scanner.nextDouble();
                int quantity = scanner.nextInt();
                
                Product product = new Product(name, price, quantity);
                cart.addProduct(product);
            }
            
            String discountType = scanner.next();

            for (Product product : cart.getProducts()) {
                System.out.printf("Product: %s, Price: %.2f, Quantity: %d%n",
                        product.getName(), product.getPrice(), product.getQuantity());
            }

            double totalAmount = cart.calculateTotalAmount();
            Discount discount;
            
            if ("festive".equalsIgnoreCase(discountType)) {
                discount = new FestiveDiscount();
            } else if ("bulk".equalsIgnoreCase(discountType)) {
                discount = new BulkDiscount(cart.getTotalQuantity());
            } else {
                discount = total -> total;
            }
            
            double finalAmount = discount.applyDiscount(totalAmount);

            Payment payment = new PaymentProcessor();
            payment.pay(finalAmount);

        } catch (Exception e) {
            System.out.println("Error processing input");
        } finally {
            scanner.close();
        }
    }
}