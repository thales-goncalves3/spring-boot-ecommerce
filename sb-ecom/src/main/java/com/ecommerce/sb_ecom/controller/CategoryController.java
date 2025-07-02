package com.ecommerce.sb_ecom.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sb_ecom.model.Category;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private List<Category> categories = new ArrayList<>();


    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories() {
        return categories;
    }
}
