package avocado.ecommercebackend.product.model;

import avocado.ecommercebackend.category.model.Category;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private int stockQuantity;
    private int price;
    private int sale;
    private int rate;
    private String productDetail;
    private Boolean isSlide;
    private Boolean isTrend;
    private Boolean isBest;
    private Boolean isTodayDeal;
    private Boolean isAlmostSold;


    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product() {
    }

    @Builder

    public Product(String productName, int stockQuantity, int price, int sale, int rate, String productDetail, Boolean isSlide, Boolean isTrend, Boolean isBest, Boolean isTodayDeal, Boolean isAlmostSold, Category category) {
        this.productName = productName;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.sale = sale;
        this.rate = rate;
        this.productDetail = productDetail;
        this.isSlide = isSlide;
        this.isTrend = isTrend;
        this.isBest = isBest;
        this.isTodayDeal = isTodayDeal;
        this.isAlmostSold = isAlmostSold;
        this.category = category;
    }
}
