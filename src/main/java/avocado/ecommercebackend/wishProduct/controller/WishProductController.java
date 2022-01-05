package avocado.ecommercebackend.wishProduct.controller;

import avocado.ecommercebackend.wishProduct.dto.WishProductDto;
import avocado.ecommercebackend.wishProduct.model.WishProduct;
import avocado.ecommercebackend.wishProduct.service.WishProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/wish")
@RequiredArgsConstructor
public class WishProductController {
    private final WishProductService wishProductService;

    @PostMapping("/add")
    public WishProduct add(@RequestBody WishProductDto wishProductDto) {
        return wishProductService.addProduct(wishProductDto);
    }

    @GetMapping("/all/{id}")
    public List<WishProduct> getWishListById(@PathVariable Long id) {
        return wishProductService.getWishList(id);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){wishProductService.deleteProduct(id);}
}
