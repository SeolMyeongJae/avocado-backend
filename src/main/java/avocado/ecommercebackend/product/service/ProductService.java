package avocado.ecommercebackend.product.service;

import avocado.ecommercebackend.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product addProduct(Product product);
    List<Product>getAllProduct();
    Optional<Product> getProductById(Long id);
    List<Product> filterProducts(Long id);
}
