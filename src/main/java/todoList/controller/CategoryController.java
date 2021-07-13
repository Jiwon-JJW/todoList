package todoList.controller;

import org.springframework.stereotype.Controller;
import todoList.service.CategoryService;

@Controller
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

}
