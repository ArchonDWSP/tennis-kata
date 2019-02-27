package fr.esiea.projet_architecture;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.esiea.projet_architecture.model.Discount;
import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;

public class ProductTest {

	
	@Test
    public void testEquals () {

        Product apples = new Product("apples", ProductUnit.Kilo);

        Discount discount = new Discount(apples, "Apples Discount", 0.199);

        Product banane = new Product("banane", ProductUnit.Kilo);
        Product toothbrush = new Product("toothbrush", ProductUnit.Each);
        Product apples1 = new Product("apples", ProductUnit.Kilo);
        Product apples2 = new Product("apples", ProductUnit.Each);

        Assertions.assertThat(apples.equals(apples)).isEqualTo(true);
        Assertions.assertThat(apples.equals(null)).isEqualTo(false);

        Assertions.assertThat(apples.equals(discount)).isEqualTo(false);

        Assertions.assertThat(apples.equals(banane)).isEqualTo(false);
        Assertions.assertThat(apples.equals(toothbrush)).isEqualTo(false);
        
        Assertions.assertThat(apples.equals(apples1)).isEqualTo(true);
        Assertions.assertThat(apples.equals(apples2)).isEqualTo(false);


    }

}
