package com.phyllipesa.course.repositories;

import com.phyllipesa.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
