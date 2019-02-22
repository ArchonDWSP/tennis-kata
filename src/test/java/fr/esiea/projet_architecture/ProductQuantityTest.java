package fr.esiea.projet_architecture;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductQuantity;
import fr.esiea.projet_architecture.model.ProductUnit;

public class ProductQuantityTest {
	 @Test
	    public void testOnProduct(){
	        Product Brosse = new Product("Brosse à dents", ProductUnit.Each);
	        ProductQuantity BrosseQte = new ProductQuantity(Brosse, 3);
	        Assertions.assertThat(BrosseQte.getProduct()).isEqualTo(Brosse);
	    }

	    @Test
	    public void testOnQuantity(){
	        Product Brosse = new Product("Brosse à dents", ProductUnit.Each);
	        ProductQuantity BrosseQte = new ProductQuantity(Brosse,3);
	        Assertions.assertThat(BrosseQte.getQuantity()).isEqualTo(3);
	    }
}
