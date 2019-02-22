package fr.esiea.projet_architecture;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;

public class ProductTest {

	
	 	@Test
	    public void testOnName(){
	        Product apples = new Product("Pommes", ProductUnit.Kilo);
	        Assertions.assertThat(apples.getName()).isEqualTo("Pommes");
	    }
	 	
	 	  @Test
	 	    public void testOnUnit(){
	 	        Product apples = new Product("Pommes", ProductUnit.Kilo);
	 	        Assertions.assertThat(apples.getUnit()).isEqualTo(ProductUnit.Kilo);
	 	    }
	 	
	 	
}
