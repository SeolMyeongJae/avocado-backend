package avocado.ecommercebackend.cartProduct.controller;

import avocado.ecommercebackend.cart.dto.ICart;
import avocado.ecommercebackend.cart.model.Cart;
import avocado.ecommercebackend.cart.repository.CartRepository;
import avocado.ecommercebackend.cart.service.CartService;
import avocado.ecommercebackend.cartProduct.dto.DtoCartProduct;
import avocado.ecommercebackend.cartProduct.dto.ICartProduct;
import avocado.ecommercebackend.cartProduct.model.CartProduct;
import avocado.ecommercebackend.cartProduct.service.CartProductService;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.repository.ProductRepository;
import avocado.ecommercebackend.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/cart")
public class CartProductController {
    @Autowired
    private CartProductService cartProductService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartRepository cartRepository;
    @PostMapping("/add")
    public CartProduct add(@RequestBody ICartProduct iCartProduct) {
        System.out.println("add Cart");
//        Product product = productService.getProduct(iCartProduct.getProductId()).get();
//        Cart cart = cartService.getCart(iCartProduct.getCartId()).get();
//        Product product = productRepository.findById(iCartProduct.getProductId()).get();
//        Cart cart = cartRepository.findById(iCartProduct.getCartId()).get();
        System.out.println(iCartProduct);
        return cartProductService.addProduct(iCartProduct);
    }

    @GetMapping("/all/{id}")
    public List<CartProduct> getByCartId(@PathVariable Long id) {
        return cartProductService.getByCartId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCart(@PathVariable Long id) {
        cartProductService.deleteProduct(id);
    }

    @PutMapping("")
    public CartProduct changeQuantity(@RequestBody DtoCartProduct dtoCartProduct){
        return cartProductService.addQuantity(dtoCartProduct.getId(),dtoCartProduct.getQuantity());
    }
}
