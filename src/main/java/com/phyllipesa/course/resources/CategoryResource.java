package com.phyllipesa.course.resources;

import com.phyllipesa.course.entities.Category;
import com.phyllipesa.course.entities.User;
import com.phyllipesa.course.services.CategoryService;
import com.phyllipesa.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {
  @Autowired
  private CategoryService categoryService;

  @GetMapping
  public ResponseEntity<List<Category>> findAll() {
    List<Category> list = categoryService.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Category> findById(@PathVariable Long id) {
    Category u = categoryService.findById(id);
    return ResponseEntity.ok().body(u);
  }
}
