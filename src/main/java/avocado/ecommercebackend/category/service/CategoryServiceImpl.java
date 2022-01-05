package avocado.ecommercebackend.category.service;

import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.category.repository.CategoryRepository;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final ProductService productService;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }
//
    @Override
    public Optional<Category> getCategory(Long id) {
        return Optional.ofNullable(categoryRepository.findById(id)).get();
    }
//
//    @Override
//    public List<Product> getCategoryByProductById(Long id) {
//        return categoryRepository.findAllByProductId(id);
//    }
}
