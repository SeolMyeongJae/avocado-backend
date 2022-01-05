package avocado.ecommercebackend.cartProduct.service;

import avocado.ecommercebackend.cart.model.Cart;
import avocado.ecommercebackend.cart.repository.CartRepository;
import avocado.ecommercebackend.cartProduct.dto.ICartProduct;
import avocado.ecommercebackend.cartProduct.model.CartProduct;
import avocado.ecommercebackend.cartProduct.repository.CartProductRepository;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartProductServiceImpl implements CartProductService {
    @Autowired
    CartProductRepository cartProductRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CartRepository cartRepository;

    @Override
    public CartProduct addProduct(ICartProduct iCartProduct) {
        Product product = productRepository.findById(iCartProduct.getProductId()).get();
        Cart cart = cartRepository.findById(iCartProduct.getCartId()).get();
        CartProduct cartProduct = new CartProduct(cart, product);

        cartProductRepository.save(cartProduct);
        return cartProduct;
    }

    @Override
    public void deleteProduct(Long id) {
        CartProduct cartProduct = cartProductRepository.findById(id).get();
    }

    @Override
    public List<CartProduct> getByCartId(Long id) {
        return cartProductRepository.findAllByCartId(id);
    }

    @Override
    public CartProduct addQuantity(Long id, int quantity) {
        CartProduct cartProduct = cartProductRepository.getById(id);
        cartProduct.setQuantity(quantity);
        return cartProductRepository.save(cartProduct);
    }
}
