package avocado.ecommercebackend.category.model;

import avocado.ecommercebackend.product.model.Product;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int type;
    private String categoryName;

    @Builder
    public Category(int type, String categoryName) {
        this.type = type;
        this.categoryName = categoryName;
    }
}
