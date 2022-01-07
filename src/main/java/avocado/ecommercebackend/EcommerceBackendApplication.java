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
//                    .isSlide(true)
//                    .isTrend(true)
//                    .isBest(true)
//                    .isTodayDeal(false)
//                    .isAlmostSold(false)
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
                    .productName("Louis Vuitton no.5")
                    .stockQuantity(41)
                    .price(650000)
                    .sale(30)
                    .rate(4)
                    .productDetail("빅투아르 드 카스텔란은 새로운 행운의 상징과 함께 Rose de vents 컬렉션의 이야기를 새롭게 써 내려갑니다. \\n이번 챕터를 위해, 그녀는 무슈 디올이 사랑해 마지않은 모티브인 하트를 선택했습니다.\\n테두리의 라이스 그레인 브레이드 장식이 돋보이는 메달은 움직임에 따라 체인 위에서 자유롭게 회전하며 하트 또는 하드 스톤의 우아한 자태를 드러냅니다.")
                    .category(categoryService.getCategory(2L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.6")
                    .stockQuantity(13)
                    .price(180000)
                    .sale(15)
                    .rate(5)
                    .productDetail("디올 하우스의 코드를 담은 우아하고 은은한 매력의 Clair D Lune 목걸이입니다. \n가느다란 팔라듐 피니시 메탈 체인 한가운데 화이트 크리스탈 CD 시그니처가 돋보입니다. \n단독으로 착용하거나 다른 목걸이와 레이어링하기 좋은 심플한 타임리스 스타일의 액세서리입니다.")
                    .category(categoryService.getCategory(2L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.7")
                    .stockQuantity(88)
                    .price(570000)
                    .sale(15)
                    .rate(4)
                    .productDetail("우아하고 세련된 미학이 깃든 Clair D Lune 목걸이입니다.\n정교하게 제작된 골드 피니시 메탈 소재의 더블 디자인으로, 화이트 레진 진주를 파베 세팅한 CD 시그니처와 하트 참이 돋보입니다. \nClair D Lune 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(2L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.8")
                    .stockQuantity(4)
                    .price(570000)
                    .sale(15)
                    .rate(3)
                    .productDetail("빅투아르 드 카스텔란은 새로운 행운의 상징과 함께 Rose de vents 컬렉션의 이야기를 새롭게 써 내려갑니다. \\n이번 챕터를 위해, 그녀는 무슈 디올이 사랑해 마지않은 모티브인 하트를 선택했습니다.\\n테두리의 라이스 그레인 브레이드 장식이 돋보이는 메달은 움직임에 따라 체인 위에서 자유롭게 회전하며 하트 또는 하드 스톤의 우아한 자태를 드러냅니다.")
                    .category(categoryService.getCategory(2L).get())
                    .build());
//1~8 명재
//        9~16 수영
//                17~24 민우
//                25~30 지수
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.9")
                    .stockQuantity(5)
                    .price(510000)
                    .sale(20)
                    .rate(4)
                    .productDetail("우아한 타임리스 스타일의 Clair D Lune 목걸이입니다. \n골드 피니시 메탈 소재로 정교하게 제작된 멀티체인 디자인으로 화이트 레진 진주 디테일, 화이트 크리스탈을 파베 세팅한 CD 시그니처 장식이 돋보입니다. \nClair D Lune 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Louis Vuitton no.10")
                    .stockQuantity(33)
                    .price(230000)
                    .sale(35)
                    .rate(5)
                    .productDetail("Monsieur Dior이 사랑한 행운의 별을 Victoire de Castellane이 팔각별 디자인의 바람 장미 실루엣으로 재해석해 선보입니다. \n움직일 때마다 그레인 브레이드로 감싼 메달이 체인 위에서 앞뒤로 회전합니다.")

                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.1")
                    .stockQuantity(55)
                    .price(730000)
                    .sale(45)
                    .rate(3)
                    .productDetail("Monsieur Dior이 사랑한 행운의 별을 Victoire de Castellane이 팔각별 디자인의 바람 장미 실루엣으로 새롭게 해석해 선보입니다.  \n 스톤 무게는 평균 무게를 기준으로 합니다. 모든 디올 Fine Jewelry 제품은 장인의 손길로 만들어진 제품으로써 미세한 흠집 및 손상으로도 제품의 가치에 영향이 있을 수 있으므로 ,\n 손상 또는 흠집이 있거나 사용 흔적이 있는 경우 교환/환불이 어려울 수 있습니다.")

                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.2")
                    .stockQuantity(2)
                    .price(730000)
                    .sale(45)
                    .rate(5)
                    .productDetail( "Monsieur Dior이 사랑한 행운의 별을 Victoire de Castellane이 팔각별 디자인의 바람 장미 실루엣으로 새롭게 해석해 선보입니다. \n 스톤 무게는 평균 무게를 기준으로 합니다. 모든 디올 Fine Jewelry 제품은 장인의 손길로 만들어진 제품으로써 미세한 흠집 및 손상으로도 제품의 가치에 영향이 있을 수 있으므로, \n 손상 또는 흠집이 있거나 사용 흔적이 있는 경우 교환/환불이 어려울 수 있습니다.")

                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.3")
                    .stockQuantity(5)
                    .price(330000)
                    .sale(25)
                    .rate(4)
                    .productDetail("로즈골드 피니시 메탈 링크와 중앙의 CD 시그니처가 어우러진 우아하면서도 볼드한 Petit CD 반지입니다.\n크리스탈 세팅과 크리스챤 디올이 가장 좋아했던 상징인 별 실루엣 참이 디자인을 완성합니다.\n 모던하고 임팩트 있는 스타일로, 데일리 아이템으로 착용하기 좋습니다.")

                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.4")
                    .stockQuantity(24)
                    .price(330000)
                    .sale(35)
                    .rate(5)
                    .productDetail("모던하면서도 타임리스한 스타일을 지닌 Dio(r)evolution 반지입니다. \n링크 디자인이 돋보이는 골드 피니시 메탈 디자인으로, 화이트 크리스탈을 파베 세팅한 DIOR 시그니처가 돋보입니다. \nDio(r)evolution 라인의 다양한 아이템과 함께 매치하기 좋습니다.")

                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.5")
                    .stockQuantity(22)
                    .price(730000)
                    .sale(45)
                    .rate(3)
                    .productDetail("우아하고 세련된 매력의 Petit CD 반지입니다. \n3줄의 골드 피니시 메탈 반지 위로 화이트 크리스탈이 파베 세팅된 CD 시그니처가 돋보입니다. 자그마한 화이트 레진 진주가 전체 디자인에 품격을 더합니다.\n 다양한 Petit CD 아이템과 매치하기 좋은 섬세한 반지입니다.")

                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.6")
                    .stockQuantity(52)
                    .price(730000)
                    .sale(45)
                    .rate(4)
                    .productDetail("이번 컬렉션의 무드를 고스란히 담은 볼드하고 강렬한 디자인의 Dior Sea Garden 반지입니다. \\n골드 피니시 메탈 메시-이펙트 밴드로 제작된 디자인으로 화이트 레진 진주와 스터드 장식이 돋보입니다. \\nDior Sea Garden 라인의 다양한 아이템과 함께 매치하기 좋은 세련된 반지입니다.")

                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.7")
                    .stockQuantity(42)
                    .price(270000)
                    .sale(15)
                    .rate(5)
                    .productDetail("빈티지한 디자인과 디올 하우스의 모던한 미학이 어우러진 30 Montaigne 반지입니다. \\n골드 피니시 메탈 소재의 밴드 위로 CHRISTIAN DIOR PARIS와 CD를 새긴 메달 장식이 돋보입니다. \\n30 Montaigne 라인의 다양한 아이템과 스타일링하기 좋은 타임리스한 반지입니다.")

                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.7")
                    .stockQuantity(42)
                    .price(270000)
                    .sale(15)
                    .rate(5)
                    .productDetail("빈티지한 디자인과 디올 하우스의 모던한 미학이 어우러진 30 Montaigne 반지입니다. \n골드 피니시 메탈 소재의 밴드 위로 CHRISTIAN DIOR PARIS와 CD를 새긴 메달 장식이 돋보입니다. \n30 Montaigne 라인의 다양한 아이템과 스타일링하기 좋은 타임리스한 반지입니다.")
                    .category(categoryService.getCategory(2L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("LBulgari no.8")
                    .stockQuantity(41)
                    .price(810000)
                    .sale(35)
                    .rate(3)
                    .productDetail("심플한 디자인에서 모던함이 느껴지는 Petit CD 반지입니다. \n골드 피니시 메탈 소재로 정교하게 제작된 디자인으로 화이트 크리스탈과 CD 시그니처 장식이 돋보입니다.\n Petit CD 라인의 다양한 아이템과 함께 매치하기 좋은 섬세하고 우아한 반지입니다.")
                    .category(categoryService.getCategory(2L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.9")
                    .stockQuantity(22)
                    .price(990000)
                    .sale(50)
                    .rate(5)
                    .productDetail("모던하면서도 타임리스한 디자인이 인상적인 CD Navy 반지입니다. \n골드 피니시 메탈 밴드와 CD 시그니처 참이 특징입니다. CD Navy 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(2L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Bulgari no.10")
                    .stockQuantity(11)
                    .price(580000)
                    .sale(15)
                    .rate(4)
                    .productDetail("패션쇼에서 선보인 타임리스하고 볼드한 디자인의 Dio(r)evolution 반지입니다. \n앤틱 골드 피니시 메탈 밴드에 장식된 골드 톤 침수정이 돋보입니다. Dio(r)evolution 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(2L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.1")
                    .stockQuantity(27)
                    .price(530000)
                    .sale(25)
                    .rate(5)
                    .productDetail("우아하고 세련된 Clair D Lune 팔찌입니다.\n 골드 피니시 메탈 소재의 더블 디자인으로, 화이트 레진 진주를 파베 세팅한 CD 시그니처와 하트 참이 돋보입니다. \nClair D Lune 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.2")
                    .stockQuantity(33)
                    .price(630000)
                    .sale(35)
                    .rate(5)
                    .productDetail("우아한 타임리스 스타일의 CD Navy 팔찌입니다.\n 골드 피니시 메탈 소재와 함께 그라데이션 실루엣의 화이트 레진 진주로 제작되었으며, 화이트 크리스탈을 파베 세팅한 중앙의 CD 시그니처가 돋보입니다. \nCD Navy 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.3")
                    .stockQuantity(27)
                    .price(830000)
                    .sale(35)
                    .rate(5)
                    .productDetail("우아함과 세련미를 모두 갖춘 30 Montaigne 팔찌입니다. \n네 줄의 화이트 글래스 비즈로 이루어진 앤틱 골드 피니시 메탈 디자인으로 화이트 크리스탈을 파베 세팅한 CD 시그니처가 시선을 사로잡습니다. \n30 Montaigne 라인의 다양한 아이템과 함께 스타일링하기 좋습니다.")
                    .category(categoryService.getCategory(1L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.4")
                    .stockQuantity(27)
                    .price(130000)
                    .sale(10)
                    .rate(4)
                    .productDetail("우아하고 세련된 Dio(r)evolution 팔찌입니다. \n골드 피니시 메탈 트위스트 체인으로 제작된 디자인으로 화이트 레진 진주와 함께 홀마크 클로버와 별 참으로 장식되었으며 DIOR 시그니처가 스타일을 완성합니다. \nDio(r)evolution 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.5")
                    .stockQuantity(22)
                    .price(130000)
                    .sale(10)
                    .rate(4)
                    .productDetail(".홀마크 Dior Caro 백에서 영감을 받아 모던하면서도 타임리스한 디자인으로 완성한 CD Navy 팔찌입니다. \n골드 피니시 메탈 소재의 멀티체인 스타일로 미니멀하게 CD 이니셜을 배치한 링크가 돋보입니다. CD Navy 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.6")
                    .stockQuantity(44)
                    .price(550000)
                    .sale(20)
                    .rate(4)
                    .productDetail("이번 컬렉션의 무드를 고스란히 담은 섬세하고 볼드한 Dior Sea Garden 커프스 팔찌입니다. \n까나쥬 모티브의 메시-이펙트 골드 피니시 메탈 소재로 제작된 견고한 디자인입니다. 섬세한 화이트 레진 진주와 스터드 장식이 돋보입니다. \nDior Sea Garden 라인의 다양한 아이템과 함께 매치하기 좋습니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.7")
                    .stockQuantity(2)
                    .price(130000)
                    .sale(7)
                    .rate(5)
                    .productDetail("볼드하고 강렬한 무드가 돋보이는 30 Montaigne 팔찌입니다. 골드 피니시 메탈 소재로 제작되었으며, 스터드가 있는 링크 디자인과 CD 시그니처 장식이 특징입니다. \n30 Montaigne 라인의 다양한 아이템과 함께 스타일링하기 좋습니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.8")
                    .stockQuantity(12)
                    .price(930000)
                    .sale(10)
                    .rate(5)
                    .productDetail("빈티지한 디자인과 디올 하우스의 모던한 미학이 어우러진 30 Montaigne 팔찌입니다. \n골드 피니시 메탈 소재로 정교하게 제작된 더블 체인 디자인으로 CHRISTIAN DIOR PARIS와 CD 시그니처를 새긴 메달 장식이 돋보입니다.\n 30 Montaigne 라인의 다양한 아이템과 함께 매치하기 좋은 타임리스한 액세서리입니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.9")
                    .stockQuantity(8)
                    .price(930000)
                    .sale(50)
                    .rate(3)
                    .productDetail("모던하면서도 타임리스한 스타일의 30 Montaigne 팔찌입니다. \n앤틱 골드 피니시 메탈 체인 중앙에 자리한 CD 시그니처가 돋보입니다. 다양한 30 Montaigne 아이템과 매치하기 좋습니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());
            productService.addProduct(Product.builder()
                    .productName("Dior no.30")
                    .stockQuantity(12)
                    .price(830000)
                    .sale(30)
                    .rate(4)
                    .productDetail("2줄의 골드 피니시 메탈 체인 중 하나를 장식한 CD 시그니처가 돋보이는 Petit CD 팔찌입니다. \n작은 화이트 크리스탈로 은은하게 장식된 다른 체인은 크리스챤 디올이 가장 좋아했던 상징인 별이 반짝이는 화이트 크리스탈로 파베 세팅되어 있습니다. \n우아한 타임리스 스타일로, 데일리 아이템으로 착용하기 좋습니다.")
                    .category(categoryService.getCategory(3L).get())
                    .build());






//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("md01.png", 1L));
//            imageService.addImage(new IImage("md02.png", 1L));
//            imageService.addImage(new IImage("md03.png", 1L));
//            imageService.addImage(new IImage("md04.png", 1L));
//            imageService.addImage(new IImage("02.png", 2L));
//            imageService.addImage(new IImage("md02.png", 2L));
//            imageService.addImage(new IImage("md05.png", 2L));
//            imageService.addImage(new IImage("md02.png", 2L));
//            imageService.addImage(new IImage("md08.png", 2L));
//            imageService.addImage(new IImage( "03.png", 3L));
//            imageService.addImage(new IImage("md11.png", 3L));
//            imageService.addImage(new IImage("md22.png", 3L));
//            imageService.addImage(new IImage("md13.png", 3L));
//            imageService.addImage(new IImage("md14.png", 3L));
//            imageService.addImage(new IImage("04.png", 4L));
//            imageService.addImage(new IImage("md30.png", 4L));
//            imageService.addImage(new IImage( "md22.png", 4L));
//            imageService.addImage(new IImage("md23.png", 4L));
//            imageService.addImage(new IImage("md18.png", 4L));
//            imageService.addImage(new IImage("01.png", 5L));
//            imageService.addImage(new IImage("01.png", 5L));
//            imageService.addImage(new IImage("01.png", 5L));
//            imageService.addImage(new IImage("01.png", 5L));
//            imageService.addImage(new IImage("01.png", 5L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));
//            imageService.addImage(new IImage("01.png", 1L));

        };
    }
}
