package avocado.ecommercebackend.wishProduct.model;

import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.wish.model.Wish;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class WishProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "wish_id")
    private Wish wish;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    public WishProduct(Wish wish, Product product) {
        this.wish = wish;
        this.product = product;

    }
}
