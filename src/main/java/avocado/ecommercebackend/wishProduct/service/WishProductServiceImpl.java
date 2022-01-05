package avocado.ecommercebackend.wishProduct.service;

import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import avocado.ecommercebackend.wish.model.Wish;
import avocado.ecommercebackend.wish.service.WishService;
import avocado.ecommercebackend.wishProduct.dto.WishProductDto;
import avocado.ecommercebackend.wishProduct.model.WishProduct;
import avocado.ecommercebackend.wishProduct.repository.WishProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@RequiredArgsConstructor
@Service
public class WishProductServiceImpl implements WishProductService {
    private final WishService wishService;
    private final ProductService productService;
    private final WishProductRepository wishProductRepository;

    @Override
    public WishProduct addProduct(WishProductDto wishProductDto) {
        log.info("wishList add in the product");
        Wish wish = wishService.getWish(wishProductDto.getWishId()).get();
        Product product = productService.getProductById(wishProductDto.getProductId()).get();
        return wishProductRepository.save(new WishProduct(wish, product));
    }

    @Override
    public List<WishProduct> getWishList(Long id) {
        log.info("wishList get in the wishList");
        return wishProductRepository.findAllByWishId(id);
    }

    @Override
    public void deleteProduct(Long id) {
        WishProduct wishProduct = wishProductRepository.getById(id);
        wishProductRepository.delete(wishProduct);
    }
}
