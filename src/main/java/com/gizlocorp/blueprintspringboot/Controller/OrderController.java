package com.gizlocorp.blueprintspringboot.Controller;

import com.gizlocorp.blueprintspringboot.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  com.gizlocorp.blueprintspringboot.Models.Orders;

import java.util.Optional;


@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    @PostMapping
    @CacheEvict(value = "order", allEntries = true) // Invalidate the entire books cache
    public ResponseEntity<Orders> addBook(@RequestBody Orders order) {
        System.out.println("order: " + order);
        Orders savedBook = orderRepository.save(order);
        System.out.println(savedBook);
        return ResponseEntity.ok(savedBook);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Orders> getBook(@PathVariable Long id) {
        Optional<Orders> book = orderRepository.findById(id);
        return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}