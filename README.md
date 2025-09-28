## Shopping Cart System (demo)

A mini shopping cart system for e-commerce platforms built using Java. The system demonstrates Object-Oriented Programming principles including encapsulation, polymorphism, and interfaces.


## Input Format
```
<Number of products (N)>
<ProductName1> <Price1> <Quantity1>
<ProductName2> <Price2> <Quantity2>
<ProductNameN> <PriceN> <QuantityN>
<Discount type (festive or bulk)>
```
## Output Format
```
Product: <name>, Price: <price>, Quantity: <quantity>
Product: <name>, Price: <price>, Quantity: <quantity>
...
Total Amount Payable: <final_amount>
```
## Example Execution

**Input:**
```
3
T-Shirt 19.99 2
Book 12.50 1
Headphones 99.99 1
festive
```
**Output:**
```
Product: T-Shirt, Price: 19.99, Quantity: 2
Product: Book, Price: 12.50, Quantity: 1
Product: Headphones, Price: 99.99, Quantity: 1
Total Amount Payable: 137.22
```

## Discount Strategies
Festive Discount
- Applies 10% discount on the total cart amount

Bulk Discount
- Applies 20% discount only if any product has quantity > 5

## Features
- Product Management
- Encapsulation
- Polymorphic Discounts
- Payment Interface
- ArrayList Management

## Project Structure
```
shopping-cart/
│
├── Product.java          # Product class with encapsulation
├── ShoppingCart.java     # Manages cart operations using ArrayList
├── Discount.java         # Discount interface for polymorphism
├── FestiveDiscount.java  # 10% festive discount implementation
├── BulkDiscount.java     # 20% bulk discount (if quantity > 5)
├── Payment.java          # Payment interface
├── PaymentProcessor.java # Payment implementation
├── Main.java            # Main program with I/O handling
└── README.md            # This file
```

-by Kanishk.
