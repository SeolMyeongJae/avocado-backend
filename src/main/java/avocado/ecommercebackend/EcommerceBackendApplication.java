package avocado.ecommercebackend;

import avocado.ecommercebackend.cart.model.Cart;
import avocado.ecommercebackend.cart.service.CartService;
import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.category.service.CategoryService;
import avocado.ecommercebackend.image.dto.IImage;
import avocado.ecommercebackend.image.service.ImageService;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import avocado.ecommercebackend.wish.model.Wish;
import avocado.ecommercebackend.wish.service.WishService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@EnableJpaAuditing
@SpringBootApplication
public class EcommerceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceBackendApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(ProductService productService, CartService cartService, WishService wishService, CategoryService categoryService, ImageService imageService){
        return args -> {
            categoryService.addCategory(Category.builder()
                    .categoryName("Necklace")
                    .build());
            categoryService.addCategory(Category.builder()
                    .categoryName("Ring")
                    .build());
            categoryService.addCategory(Category.builder()
                    .categoryName("Bracelet")
                    .build());
            cartService.addCart(new Cart());
            wishService.addWish(new Wish());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.1")
                    .stockQuantity(41)
                    .price(280000)
                    .sale(10)
                    .rate(4)
                    .productDetail("디올 하우스의 코드를 담은 우아하고 은은한 매력의 Clair D Lune목걸이입니다. \\n 가느다란 골드 피니시 메탈 체인 한가운데 화이트 크리스탈 CD 시그니처가 돋보입니다.\\n 단독으로 착용하거나 다른 목걸이와 레이어링하기 좋은 심플한 타임리스 스타일의 액세서리입니다.")

                    .category(categoryService.getCategory(1L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.2")
                    .stockQuantity(6)
                    .price(370000)
                    .sale(20)
                    .rate(4)
                    .productDetail("디올 하우스의 코드를 담은 우아하고 은은한 매력의 Clair D Lune목걸이입니다. \\n 가느다란 골드 피니시 메탈 체인 한가운데 화이트 크리스탈 CD 시그니처가 돋보입니다.\\n 단독으로 착용하거나 다른 목걸이와 레이어링하기 좋은 심플한 타임리스 스타일의 액세서리입니다.")

                    .category(categoryService.getCategory(1L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.3")
                    .stockQuantity(58)
                    .price(330000)
                    .sale(15)
                    .rate(3)
                    .productDetail("우아한 타임리스 스타일의 Dio(r)evolution 목걸이입니다. \\n 골드 피니시 메탈 체인에 DIOR 레터가 달려 있으며, 화이트 크리스탈로 파베 세팅한 O 레터가 목에 반짝임을 더합니다. \\n Dio(r)evolution 라인의 다양한 아이템과 함께 매치하기 좋으며 손쉽게 스타일링할 수 있습니다.")

                    .category(categoryService.getCategory(1L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.4")
                    .stockQuantity(15)
                    .price(250000)
                    .sale(15)
                    .rate(2)
                    .productDetail("디올 하우스의 코드를 담은 우아하고 은은한 매력의 Clair D Lune목걸이입니다. \\n 가느다란 골드 피니시 메탈 체인 한가운데 화이트 크리스탈 CD 시그니처가 돋보입니다.\\n 단독으로 착용하거나 다른 목걸이와 레이어링하기 좋은 심플한 타임리스 스타일의 액세서리입니다.")

                    .category(categoryService.getCategory(1L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.5")
                    .stockQuantity(41)
                    .price(400000)
                    .sale(15)
                    .rate(3)
                    .productDetail("빅투아르 드 카스텔란은 새로운 행운의 상징과 함께 Rose de vents 컬렉션의 이야기를 새롭게 써 내려갑니다. \\n이번 챕터를 위해, 그녀는 무슈 디올이 사랑해 마지않은 모티브인 하트를 선택했습니다.\\n테두리의 라이스 그레인 브레이드 장식이 돋보이는 메달은 움직임에 따라 체인 위에서 자유롭게 회전하며 하트 또는 하드 스톤의 우아한 자태를 드러냅니다.")

                    .category(categoryService.getCategory(1L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.6")
                    .stockQuantity(13)
                    .price(180000)
                    .sale(15)
                    .rate(5)
                    .productDetail("디올 하우스의 코드를 담은 우아하고 은은한 매력의 Clair D Lune 목걸이입니다. \n가느다란 팔라듐 피니시 메탈 체인 한가운데 화이트 크리스탈 CD 시그니처가 돋보입니다. \n단독으로 착용하거나 다른 목걸이와 레이어링하기 좋은 심플한 타임리스 스타일의 액세서리입니다.")

                    .category(categoryService.getCategory(1L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.7")
                    .stockQuantity(88)
                    .price(570000)
                    .sale(20)
                    .rate(4)
                    .productDetail("우아하고 세련된 미학이 깃든 Clair D Lune 목걸이입니다.\n정교하게 제작된 골드 피니시 메탈 소재의 더블 디자인으로, 화이트 레진 진주를 파베 세팅한 CD 시그니처와 하트 참이 돋보입니다. \nClair D Lune 라인의 다양한 아이템과 함께 매치하기 좋습니다.")

                    .category(categoryService.getCategory(1L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.8")
                    .stockQuantity(4)
                    .price(330000)
                    .sale(70)
                    .rate(3)
                    .productDetail("모던하고 간결한 디자인의 Petit CD 목걸이입니다. \n골드 피니시 메탈 소재로 정교하게 제작된 디자인으로 화이트 크리스탈과 CD 시그니처 장식이 특징입니다.\nPetit CD 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(1L).get())
                    .build());

            for(int i = 1; i <= 30; i++) {
                String img = "";
                Long x = Long.valueOf(i);
                if(i < 10) {
                    img = "0" + String.valueOf(i);
                } else img = String.valueOf(i);
                img = img + ".png";
                imageService.addImage(new IImage(img, x));
            }

            for(int i = 1; i <= 30; i++) {
                String img = "";
                Long x = Long.valueOf(i);
                for(int j = 0; j < 4; j++) {
                    int random = (int)(Math.random() * 30 + 1);
                    img = "md" + random + ".png";
                    imageService.addImage(new IImage(img, x));
                }
            }





        };
    }
}
