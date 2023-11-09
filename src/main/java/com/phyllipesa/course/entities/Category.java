package com.phyllipesa.course.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ide;
  private String name;

  public Category() {
  }

  public Category(Long ide, String name) {
    this.ide = ide;
    this.name = name;
  }

  public Long getIde() {
    return ide;
  }

  public void setIde(Long ide) {
    this.ide = ide;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Category categoy)) return false;
    return Objects.equals(ide, categoy.ide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ide);
  }
}
