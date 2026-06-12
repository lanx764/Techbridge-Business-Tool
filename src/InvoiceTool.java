public class InvoiceTool {
    public static void main(String[] args) {
        String clientName = "Basit Enterprises";
        String productName = "Enterprise Software License";
        double unitPrice = 1250.00;
        int quantity = 4;
        int discountPercent = 15;
        final double TAX_RATE = 7.5;
        double subTotal = unitPrice * quantity;
        double discountAmount = subTotal * (double) discountPercent / 100.0;
        double afterDiscount = subTotal - discountAmount;
        double taxAmount = afterDiscount * (double) TAX_RATE / 100.0;
        double total = afterDiscount + taxAmount;

        System.out.println("╔══════════════════════════════════════╗\n" +
                "║         TECHBRIDGE SOLUTIONS         ║\n" +
                "║            Invoice Tool              ║\n" +
                "╚══════════════════════════════════════╝");
        System.out.println("Client: " + clientName);
        System.out.println("Product: " + productName);
        System.out.printf("Unit Price: $%.2f%n", unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Subtotal: $%.2f%n", subTotal);
        System.out.printf("Discount (15%%): $%.2f%n", discountAmount);
        System.out.printf("After Discount: $%.2f%n", afterDiscount);
        System.out.printf("Tax (7.5%%): $%.2f%n", taxAmount);
        System.out.printf("Total: $%.2f%n", total);
        System.out.println("Bulk Order");
    }
}
