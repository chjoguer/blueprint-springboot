package com.gizlocorp.blueprintspringboot.Models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
@Data
public class Users {
    @Id
    private String id;
    private String userName;
    private int age;
    private String reviewerName;
    private String comment;
}