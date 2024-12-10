package ait.cochort49.shop.homeworkshop.servise;

import ait.cochort49.shop.homeworkshop.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
