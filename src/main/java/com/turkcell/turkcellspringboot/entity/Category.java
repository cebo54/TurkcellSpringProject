package com.turkcell.turkcellspringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    //@{BuClass}to{DiğerClass}
    //mappedBy = diğer entityde bu entityi temsil eden değer
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> producst;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducst() {
        return producst;
    }

    public void setProducst(List<Product> producst) {
        this.producst = producst;
    }
}
