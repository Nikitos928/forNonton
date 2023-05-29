package service;

import model.Product;

import java.util.List;

public interface Products {
    public boolean addProduct(Product product);

    public boolean deleteProduct(Product product);

    public String getName(String id);

    public List<String> findByName(String name);
}
