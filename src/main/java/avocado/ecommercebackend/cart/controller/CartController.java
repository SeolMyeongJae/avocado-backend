package avocado.ecommercebackend.cart.controller;

import avocado.ecommercebackend.cart.dto.ICart;
import avocado.ecommercebackend.cartProduct.model.CartProduct;
import avocado.ecommercebackend.cart.service.CartService;
import avocado.ecommercebackend.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartList")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/getAll/{cartId}")
    public List<CartProduct> getCartList(@PathVariable long cartId) {
        return cartService.getCartList(cartId);
    }

//    @PostMapping("/add")
//    public CartProduct add(@RequestBody ICart iCart) {
//        System.out.println("add cart");
//        Product product = productService.getProduct(iCart.getProductId()).get();
//        System.out.println(product.toString());
//        Cart cart = new Cart();
//
//        System.out.println(cart.toString());
//        return cartService.addItem(iCart);
//    }

}
