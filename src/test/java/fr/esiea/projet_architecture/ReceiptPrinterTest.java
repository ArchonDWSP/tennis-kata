package fr.esiea.projet_architecture;

import fr.esiea.projet_architecture.ReceiptPrinter;

import fr.esiea.projet_architecture.model.SupermarketCatalog;
import fr.esiea.projet_architecture.model.Teller;
import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;
import fr.esiea.projet_architecture.model.Receipt;
import fr.esiea.projet_architecture.model.ShoppingCart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReceiptPrinterTest {

    @Test
    public void testPrinter(){
        SupermarketCatalog catalog = new FakeCatalog();
        ShoppingCart cart = new ShoppingCart();

        Product banane = new Product("wine", ProductUnit.Kilo);
        Product gateau = new Product("beer",ProductUnit.Each);
        Product apple = new Product("Apple",ProductUnit.Kilo);

        catalog.addProduct(banane, 2.00);
        catalog.addProduct(gateau, 5.00);
        catalog.addProduct(apple, 0.50);


        Teller teller = new Teller(catalog);
        cart.addItemQuantity(banane,1);
        cart.addItemQuantity(gateau,2);
        cart.addItemQuantity(apple,5);



        Receipt receipt = teller.checksOutArticlesFrom(cart);
        ReceiptPrinter printer = new ReceiptPrinter();

        Assertions.assertThat(printer.printReceipt(receipt)).isNotBlank();
    }
}