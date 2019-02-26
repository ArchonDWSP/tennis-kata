package fr.esiea.projet_architecture;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.esiea.projet_architecture.model.Discount;
import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;

public class DiscountTest {
	 @Test
	    public void testOnDescription(){
	        Product Chocolat = new Product("Chocolat", ProductUnit.Each);
	        Discount testDiscount = new Discount(Chocolat, "discount", 2.5);
	        Assertions.assertThat(testDiscount.getDescription()).isEqualTo("discount");
	    }

	    @Test
	    public void testOnDiscountAmount(){
	    	Product Chocolat = new Product("Chocolat", ProductUnit.Each);
	        Discount testDiscount = new Discount(Chocolat, "discount", 2.5);
	        Assertions.assertThat(testDiscount.getDiscountAmount()).isEqualTo(2.5);
	    }

	    @Test
	    public void testOnProduct(){
	    	Product Chocolat = new Product("Chocolat", ProductUnit.Each);
	        Discount testDiscount = new Discount(Chocolat, "discount", 2.5);
	        Assertions.assertThat(testDiscount.getProduct()).isEqualTo(Chocolat);
	    }
}
