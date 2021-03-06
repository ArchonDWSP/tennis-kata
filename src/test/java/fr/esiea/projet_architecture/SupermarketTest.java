package fr.esiea.projet_architecture;

import fr.esiea.projet_architecture.ReceiptPrinter;

import fr.esiea.projet_architecture.model.Discount;
import fr.esiea.projet_architecture.model.SupermarketCatalog;
import fr.esiea.projet_architecture.model.Teller;
import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;
import fr.esiea.projet_architecture.model.Receipt;
import fr.esiea.projet_architecture.model.ShoppingCart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SupermarketTest {

    @Test
    public void testSomething() {
        SupermarketCatalog catalog = new FakeCatalog();
        Product toothbrush = new Product("toothbrush", ProductUnit.Each);
        catalog.addProduct(toothbrush, 0.99);
        Product apples = new Product("apples", ProductUnit.Kilo);
        catalog.addProduct(apples, 1.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(apples, 2.5);

        Teller teller = new Teller(catalog);
        //teller.addSpecialOffer(SpecialOfferType.TenPercentDiscount, toothbrush, 10.0);

        Receipt receipt = teller.checksOutArticlesFrom(cart);

        Assertions.assertThat(receipt.getTotalPrice()).isEqualTo(4.975);
    }

    @Test
    public void testReceiptPrinter() {
        SupermarketCatalog catalog = new FakeCatalog();
        Product toothbrush = new Product("toothbrush", ProductUnit.Each);
        catalog.addProduct(toothbrush, 0.99);
        Product apples = new Product("apples", ProductUnit.Kilo);
        catalog.addProduct(apples, 1.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addItemQuantity(apples, 2.5);

        Teller teller = new Teller(catalog);

        Receipt receipt = teller.checksOutArticlesFrom(cart);
        receipt.addDiscount(new Discount(apples, "Reduction pomme", 0.3));

        Assertions.assertThat(new ReceiptPrinter().printReceipt(receipt)).isNotBlank();
    }


}