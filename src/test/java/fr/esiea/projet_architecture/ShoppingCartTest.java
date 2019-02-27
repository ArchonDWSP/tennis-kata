package fr.esiea.projet_architecture;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;
import fr.esiea.projet_architecture.model.Receipt;
import fr.esiea.projet_architecture.model.ShoppingCart;
import fr.esiea.projet_architecture.model.SupermarketCatalog;
import fr.esiea.projet_architecture.model.Teller;

public class ShoppingCartTest {
	 
		@Test
	    public void addItemTestWithoutDiscount(){
	        SupermarketCatalog catalog = new FakeCatalog();
	        ShoppingCart cart = new ShoppingCart();

	        Product gateau = new Product("gateau", ProductUnit.Each);
	        catalog.addProduct(gateau,10.00);

	        cart.addItem(gateau);

	        Teller teller = new Teller(catalog);
	        Receipt receipt = teller.checksOutArticlesFrom(cart);

	        Assertions.assertThat(receipt.getTotalPrice()).isEqualTo(10.00);

	        cart.addItemQuantity(gateau,2);
	        receipt = teller.checksOutArticlesFrom(cart);
	        Assertions.assertThat(receipt.getTotalPrice()).isEqualTo(30.00);
	    }
}
