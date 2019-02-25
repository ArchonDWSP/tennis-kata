package fr.esiea.projet_architecture;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.ProductUnit;
import fr.esiea.projet_architecture.model.ReceiptItem;

public class ReceiptTest {
	  
	@Test
	    public void testOnPrice() {
	        Product Gateau = new Product("Gateau", ProductUnit.Each);
	        ReceiptItem receiptItem = new ReceiptItem(Gateau,5,1,5);
	        Assertions.assertThat(receiptItem.getPrice()).isEqualTo(1);
	    }

	    @Test
	    public void testOnProduct(){
	        Product Gateau = new Product("Gateau",ProductUnit.Each);
	        ReceiptItem receiptItem = new ReceiptItem(Gateau,5,1,5);
	        Assertions.assertThat(receiptItem.getProduct()).isEqualTo(Gateau);
	    }

	    @Test
	    public void testOnQuantity(){
	        Product product = new Product("Gateau",ProductUnit.Each);
	        ReceiptItem receiptItem = new ReceiptItem(product,5,1,5);
	        Assertions.assertThat(receiptItem.getQuantity()).isEqualTo(5);
	    }

	    @Test
	    public void testOnTotalPrice(){
	    	Product product = new Product("Gateau",ProductUnit.Each);
	        ReceiptItem receiptItem = new ReceiptItem(product,5,1,5);
	        Assertions.assertThat(receiptItem.getTotalPrice()).isEqualTo(5);
	    }
}
