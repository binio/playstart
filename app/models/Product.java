package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomasz.biniecki on 11/09/2017.
 */
public class Product {

    private static List<Product> products;
    static {
        products = new ArrayList<Product>();
        products.add(new Product("1111", "Paperclips 1", "Description..."));
        products.add(new Product("2222", "Paperclips 2", "Description..."));
        products.add(new Product("3333", "Paperclips 3", "Description..."));
        products.add(new Product("4444", "Paperclips 4", "Description..."));
        products.add(new Product("5555", "Paperclips 5", "Description..."));
    }

    public String ean;
    public String name;
    public String description;

    public Product(){}

    public Product(String ean, String name, String description) {
        this.ean = ean;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ean='" + ean + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static List<Product> findAll() {
        return new ArrayList<Product>(products);
    }

    public static Product findByEan(String ean) {
        for (Product candidate : products) {
            if (candidate.ean.equals(ean)) {
                return candidate;
            }
        }
        return null;
    }

    public static List<Product> findByName(String term) {
        final List<Product> results = new ArrayList<Product>();
        for (Product candidate : products) {
            if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
                results.add(candidate);
            }
        }
        return results;
    }

    public static boolean remove(Product product) {
        return products.remove(product);
    }

    public void save() {
        products.remove(findByEan(this.ean));
        products.add(this);
    }


}
