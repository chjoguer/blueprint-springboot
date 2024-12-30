package com.gizlocorp.blueprintspringboot.Models;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "order", schema = "public")
@Data
public class Orders {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}