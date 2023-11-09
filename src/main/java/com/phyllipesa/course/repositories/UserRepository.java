package com.phyllipesa.course.repositories;

import com.phyllipesa.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
