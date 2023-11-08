package com.phyllipesa.course.resources;

import com.phyllipesa.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UseResource {
  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "Fepulio", "fepu@ex.com", "1245783", "seuclay");
    return ResponseEntity.ok().body(u);
  }
}
