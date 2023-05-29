package service;

import model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ProductsImpl implements Products {

    Map<String, Product> products = new HashMap<>();

    public boolean addProduct(Product product) {
        if (products.containsKey(product.getId())) {
            return false;
        } else {
            products.put(product.getId(), product);
            return true;
        }

    }

    public boolean deleteProduct(Product product) {
        if (products.containsKey(product.getId())) {
            return products.remove(product.getId(), product);
        } else {
            return false;
        }
    }

    public String getName(String id) {
        if (products.containsKey(id)) {
            return products.get(id).getName();
        } else {
            return "";
        }
    }

    public List<String> findByName(String name) {
        return products.values().stream()
                .filter(product -> (product.getName().equals(name)))
                .map(Product::getId)
                .collect(Collectors.toList());
    }

}
