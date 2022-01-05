package avocado.ecommercebackend.cartProduct.service;

import avocado.ecommercebackend.cart.model.Cart;
import avocado.ecommercebackend.cartProduct.dto.ICartProduct;
import avocado.ecommercebackend.cartProduct.model.CartProduct;
import avocado.ecommercebackend.product.model.Product;

import java.util.List;

public interface CartProductService {
    CartProduct addProduct(ICartProduct iCartProduct);
    List<CartProduct> getByCartId(Long id);
    void deleteProduct(Long id);
    CartProduct addQuantity(Long id, int quantity);

}
