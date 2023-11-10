package com.phyllipesa.course.repositories;

import com.phyllipesa.course.entities.Category;
import com.phyllipesa.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
