package avocado.ecommercebackend.product.controller;

import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
        public Product add(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @GetMapping("/get/{id}")
    public Product get(@PathVariable Long id) {
        return productService.getProductById(id).get();
    }

    @GetMapping("/{id}")
    public List<Product> getFilter(@PathVariable Long id) {
        System.out.println(id);
        return productService.filterProducts(id);
    }
}
