package fr.esiea.projet_architecture;

import java.util.HashMap;
import java.util.Map;

import fr.esiea.projet_architecture.model.Product;
import fr.esiea.projet_architecture.model.SupermarketCatalog;

public class FakeCatalog implements SupermarketCatalog {
    private Map<String, Product> products = new HashMap<String, Product>();
    private Map<String, Double> prices = new HashMap<String, Double>();

    public void addProduct(Product product, double price) {
        this.products.put(product.getName(), product);
        this.prices.put(product.getName(), price);
    }

    public double getUnitPrice(Product p) {
        return this.prices.get(p.getName());
    }
}
