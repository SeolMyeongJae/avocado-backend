package avocado.ecommercebackend.cartProduct.model;

import avocado.ecommercebackend.cart.model.Cart;
import avocado.ecommercebackend.product.model.Product;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@NoArgsConstructor
public class CartProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Getter
    @Setter
    private int quantity;

    public CartProduct(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
        this.quantity = 1;
    }

    public Product getProduct() {
        return product;
    }


}
