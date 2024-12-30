package com.gizlocorp.blueprintspringboot.Controller;

import com.gizlocorp.blueprintspringboot.Models.Users;
import com.gizlocorp.blueprintspringboot.Repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class ClientController {
    private final ClientRepository clientRepository;

    @PostMapping
    public ResponseEntity<Users> addReview(@RequestBody Users data) {
        Users savedReview = clientRepository.save(data);
        return ResponseEntity.ok(savedReview);
    }
    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = clientRepository.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{username}")
    public ResponseEntity<Users> getReview(@PathVariable String username) {
        Optional<Users> review = clientRepository.findByUserName(username);
        return review.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}