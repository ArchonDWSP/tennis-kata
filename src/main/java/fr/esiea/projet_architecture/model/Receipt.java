package fr.esiea.projet_architecture.model;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<ReceiptItem> items = new ArrayList<ReceiptItem>();
    private List<Discount> discounts = new ArrayList<Discount>();

    public Double getTotalPrice() {
        double total = 0.0;
        for (ReceiptItem item : this.items) {
            total += item.getTotalPrice();
        }
        for (Discount discount : this.discounts) {
            total -= discount.getDiscountAmount();
        }
        return total;
    }

    public void addProduct(Product p, double quantity, double price, double totalPrice) {
        this.items.add(new ReceiptItem(p, quantity, price, totalPrice));
    }

    public List<ReceiptItem> getItems() {
        return new ArrayList<ReceiptItem>(this.items);
    }

    public void addDiscount(Discount discount) {
        this.discounts.add(discount);
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }
}
