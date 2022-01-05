package avocado.ecommercebackend.cart.service;

import avocado.ecommercebackend.cart.dto.ICart;
import avocado.ecommercebackend.cart.model.Cart;
import avocado.ecommercebackend.cartProduct.model.CartProduct;

import java.util.List;
import java.util.Optional;

public interface CartService {
    Cart addCart(Cart cart);
    Optional<Cart> getCart(Long id);
    List<CartProduct> getCartList(Long cartId);
    Cart addCart();

}
