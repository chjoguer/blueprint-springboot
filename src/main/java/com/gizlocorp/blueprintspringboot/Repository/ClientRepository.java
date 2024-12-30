package com.gizlocorp.blueprintspringboot.Repository;

import com.gizlocorp.blueprintspringboot.Models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClientRepository extends MongoRepository<Users, String> {
    Optional<Users> findByUserName(String username);
}
