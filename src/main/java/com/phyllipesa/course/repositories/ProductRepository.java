package com.phyllipesa.course.repositories;

import com.phyllipesa.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
