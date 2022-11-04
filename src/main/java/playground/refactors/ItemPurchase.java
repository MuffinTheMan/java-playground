package playground.refactors;

// Composing Methods - Replace Temp with Query (Fowler, 120)
public class ItemPurchase {
    private final double itemPrice;
    private final int quantity;

    public ItemPurchase(final double itemPrice, final int quantity) {
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double totalPriceA() {
        final double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        }
        return basePrice * 0.98;
    }

    public double totalPriceB() {
        if (basePrice() > 1000) {
            return basePrice() * 0.95;
        }
        return basePrice() * 0.98;
    }

    private double basePrice() {
        return quantity * itemPrice;
    }
}