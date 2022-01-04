package avocado.ecommercebackend.cart.service;

import avocado.ecommercebackend.cart.dto.ICart;
import avocado.ecommercebackend.cart.model.Cart;
import avocado.ecommercebackend.cartProduct.model.CartProduct;
import avocado.ecommercebackend.cartProduct.repository.CartProductRepository;
import avocado.ecommercebackend.cart.repository.CartRepository;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Optional<Cart> getCart(Long id) {
        return Optional.ofNullable(cartRepository.findById(id)).get();
    }

    @Override
    public List<CartProduct> getCartList(Long cartId) {
        Cart cart = cartRepository.getById(cartId);
        return cart.getCartList();
    }


}
