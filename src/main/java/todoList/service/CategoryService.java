package todoList.service;

import org.springframework.stereotype.Service;
import todoList.repository.CategoryRepository;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
