package avocado.ecommercebackend.categorylist.service;

import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.categorylist.model.CategoryList;
import avocado.ecommercebackend.categorylist.repository.CategoryListRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class CategoryListServiceImpl implements CategoryListService {

// log.info("CategoryListService found in the db");
 // 어노테이션을 호출했음에도 문제가 일어나는 이유 물어보기

    @Autowired
    private CategoryListRepository categoryListRepository;

    @Override
    public CategoryList addCategoryList(CategoryList categoryList) {
        log.info("CategoryListService found in the db");
        return categoryListRepository.save(categoryList);
    }

    @Override
    public List<CategoryList> getAllCategoryList() {
        return categoryListRepository.findAll();
    }

    @Override
    public Optional<CategoryList> getCategoryList(Long id) {
        return Optional.ofNullable(categoryListRepository.findById(id)).get();
    }
}
