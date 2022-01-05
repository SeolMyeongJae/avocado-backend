package avocado.ecommercebackend.category.controller;


import avocado.ecommercebackend.category.dto.CategoryDto;
import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.category.service.CategoryService;
import avocado.ecommercebackend.product.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryController {


    private final CategoryService categoryService;

//    @PostMapping("/add")
//    public Category add(@RequestBody CategoryDto categoryDto){
//        return categoryService.addCategory(categoryDto);
//    }
    @GetMapping("/getAll")
    public List<Category>getAllCategory(){
        return categoryService.getAllCategory();
    }
//    @GetMapping("/get/{id}")
//    public Category get(@PathVariable Long id){
//        return categoryService.getCategory(id).get();
//    }
//    @GetMapping("/getCategoryByProductById/{id}")
//    public List<Product> getCategoryByProductById(@PathVariable Long id){
//       return categoryService.getCategoryByProductById(id);
//        }
}
