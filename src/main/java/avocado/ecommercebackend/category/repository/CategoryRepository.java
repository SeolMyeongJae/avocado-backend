package avocado.ecommercebackend.category.repository;

import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
