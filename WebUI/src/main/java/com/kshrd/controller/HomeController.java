package com.kshrd.controller;

import com.kshrd.model.Category;
import com.kshrd.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CategoryRepository categoryRepo;

    @GetMapping("/category")
    @ResponseBody
    public List<Category> home() {
       return categoryRepo.findAll();
    }

}
