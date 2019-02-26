<<<<<<< HEAD
package fr.esiea.projet_architecture;

import org.junit.jupiter.api.Test;

import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;
import fr.esiea.projet_architecture.model.Receipt;
import fr.esiea.projet_architecture.model.ShoppingCart;
import fr.esiea.projet_architecture.model.SpecialOfferType;
import fr.esiea.projet_architecture.model.SupermarketCatalog;
import fr.esiea.projet_architecture.model.Teller;

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
        teller.addSpecialOffer(SpecialOfferType.TenPercentDiscount, toothbrush, 10.0);

        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // Todo: complete this test
    }
}
=======
package fr.esiea.projet_architecture;

import org.junit.jupiter.api.Test;

import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;
import fr.esiea.projet_architecture.model.Receipt;
import fr.esiea.projet_architecture.model.ShoppingCart;
import fr.esiea.projet_architecture.model.SpecialOfferType;
import fr.esiea.projet_architecture.model.SupermarketCatalog;
import fr.esiea.projet_architecture.model.Teller;

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
        teller.addSpecialOffer(SpecialOfferType.TenPercentDiscount, toothbrush, 10.0);

        Receipt receipt = teller.checksOutArticlesFrom(cart);

        // Todo: complete this test
    }
}
>>>>>>> f83d48ab1440c1fa4dc57b180503d2c37cf4e87e
