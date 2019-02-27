package fr.esiea.projet_architecture;

import fr.esiea.projet_architecture.model.Discount;
import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.SupermarketCatalog;

import java.util.Map;

public interface Offer {

    Product[] getProducts();

    Discount getDiscount();

    Map<Product,Double> makeDiscount(Map<Product,Double> productQuantities, SupermarketCatalog catalog);

}